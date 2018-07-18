package controller;

import utility.Dijkastra;
import utility.readInput;
import utility.Scheduling;
import utility.sortRequest;
import utility.OutputRevenew;

import java.io.IOException;
public class Driver {
	public   static void  main(String args[])throws IOException{
	
				readInput ri=new readInput();
				ri.reading();
				 OutputRevenew o=new OutputRevenew();
				sortRequest s=new sortRequest();
				s.sortReq(ri.getReq());
				 Dijkastra dj=new Dijkastra();
				
				for(int i=0;i<ri.getN();i++)
				{
					dj.dij(ri.getLocation(),ri.getN(),i);
				}
				
				 Scheduling sd=new Scheduling();
				 
				 sd.schedule(ri.getCar(),ri.getReq(),ri.getLocation());
				 
				
				 o.writeOut(ri.getCar());
				 
				 
		
	}
	//file file=new file();

}
