/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecmogi.ia;

import weka.attributeSelection.AttributeSelection;
import weka.attributeSelection.InfoGainAttributeEval;
import weka.attributeSelection.Ranker;
import weka.classifiers.functions.LinearRegression;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.SelectedTag;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;

public class Classificacao {
    private DataSource source;
    private Instances data;
    private Instances filteredData;
    private Remove filter;
    private AttributeSelection attributeSelection;
    private InfoGainAttributeEval avaliador;
    private Ranker busca;
    private LinearRegression trainedDataSet;
    private String[] options = new String[]{"-R", "16"};


    public Classificacao() {
        try {
            source = new DataSource("dados/carros.arff");
            data = source.getDataSet();
            data.setClassIndex(data.numAttributes() - 1);

            filter = new Remove();
            filter.setOptions(options);
            filter.setInputFormat(data);
            data = Filter.useFilter(data, filter);

//            selAtributo = new AttributeSelection();
//            avaliador = new ();
//            busca = new Ranker();
//            selAtributo.setEvaluator(avaliador);
//            selAtributo.setSearch(busca);
//            selAtributo.SelectAttributes(data);

//            String[] options2 = new String[] {""};
            String[] opcoes = new String[] {"-S", "0"};
            trainedDataSet = new LinearRegression();
            trainedDataSet.setOptions(opcoes);
            trainedDataSet.buildClassifier(data);
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
    }
    
    String classificar(double[] vals)
    {
        String retorno = "";
        try
        {
            Instance precoCarro = new DenseInstance(1.0, vals);

            precoCarro.setDataset(data);
//          precoCarro.setClassMissing();

            double label = trainedDataSet.classifyInstance(precoCarro);
            retorno = String.valueOf(label);
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        return retorno;
    }
}
