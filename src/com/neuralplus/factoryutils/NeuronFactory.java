package com.neuralplus.factoryutils;

import java.util.ArrayList;

import com.neuralplus.Ineuron.Neurons;
import com.neuralplus.Ineuron.Neurons.Neuron;
import com.neuralplus.neuron.Perceptron;

public class NeuronFactory {

		int NeuronCount = 0;
	
	public NeuronFactory() {
		NeuronCount = NeuronCount +1;
	}

	public int getNeuronCount()
	{
		return NeuronCount;
	}
	
	public Neurons getNeuron(Neuron neuronType , ArrayList<Integer> weightsList, int thrashHold)
	{
		if (neuronType == Neuron.PERCEPTRON)
		{
			return new Perceptron(weightsList,thrashHold);
		}
		else if (neuronType == Neuron.SIGMOID)
		{
			// change this too sigmoid class when completed
			return new Perceptron(weightsList,thrashHold);
		}
		else
		{
			System.out.println("Neuron Type not Specified");
			return null;
		}
	}
	
}
