package br.com.drummond.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ac2 {
	
	@RequestMapping(value = "/api2/{numero}", method = RequestMethod.GET)
	public String Resultado(@PathVariable Integer numero)
	{
		
		String resultado;
		
		
		if (numero % 10 == 0)
	    {
			resultado = "Sim";
	    }
		else
		{
			resultado = "Não";
		}
		return resultado;
		
	}
}
