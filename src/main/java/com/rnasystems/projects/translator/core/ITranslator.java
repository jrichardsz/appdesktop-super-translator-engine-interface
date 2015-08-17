package com.rnasystems.projects.translator.core;

public interface ITranslator{
	
	public String translate(String word, String languajeIni, String languajeEnd) throws Exception;
	public String getInfo();

}
