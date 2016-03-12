package com.neuralplus.Ineuron;

import java.util.ArrayList;

public abstract class Neurons {
    public int biasThrashold;
	public ArrayList<Integer> weightSeq = new ArrayList<Integer>();
	public enum Neuron {
	    PERCEPTRON , SIGMOID 
	}
	public int getBiasThrashold() {
		return biasThrashold;
	}

	public void setBiasThrashold(int biasThrashold) {
		this.biasThrashold = biasThrashold;
	}

	public ArrayList<Integer> getWeightSeq() {
		return weightSeq;
	}

	public void setWeightSeq(ArrayList<Integer> weightSeq) {
		this.weightSeq = weightSeq;
	}

	public Neurons(ArrayList<Integer> weightsList , int thrashHold)
		{
		biasThrashold = thrashHold;
		weightSeq = weightsList;
		}

   public abstract int fireNeuron(ArrayList<Integer> values);
   

   }


