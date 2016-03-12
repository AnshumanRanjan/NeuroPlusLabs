/**
 * 
 */
package com.neuralplus.neuron;
import java.util.ArrayList;

import com.neuralplus.Ineuron.*;
/**
 * @author Anshuman
 *
 */
public  class Perceptron extends Neurons {

	public Perceptron(ArrayList<Integer> weightsList, int thrashHold) {
		super(weightsList, thrashHold);
		// TODO Auto-generated constructor stub
	}

	public int fireNeuron(ArrayList<Integer> values){
		   
		   if(values.size() != weightSeq.size())
		   {
		   	System.out.println("Neural Network Collapsed");
		   }
		   else
		   {
		   	Integer counter =0;
		   	int outPutThrasHoldValue = 0;
		   	for(counter =0 ; counter < values.size() ; counter++)
		   	{
		   		outPutThrasHoldValue = values.get(counter)*weightSeq.get(counter);
		   	}
		   	if (outPutThrasHoldValue >= biasThrashold)
		   	{
		   		return 1;
		   	}
		   	else
		   	{
		   		return 0;
		   	}
		   }
		   return 2;

		   
	}

}