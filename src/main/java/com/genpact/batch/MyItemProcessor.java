package com.genpact.batch;

import org.springframework.batch.item.ItemProcessor;

import com.genpact.batch.model.Report;

public class MyItemProcessor implements ItemProcessor<Report, Report> {

	public Report process(Report item) throws Exception {
 
		System.out.println("Processing..." + item);
		return item;
	}
}
