package pe.bbva.aso.servicios.cliente.base.resttemplate;

import java.net.URI;
import java.util.Map;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriTemplate;

public class CustomUriTemplate extends UriTemplate {
	private static final long serialVersionUID = 1L;
	
	private UriComponents uriComponents = null;
	
	public CustomUriTemplate(String uriTemplate) {
		super(uriTemplate);
		this.uriComponents = UriComponentsBuilder.fromUriString(uriTemplate).build();
	}
	
	public URI expandWithoutEncode(Map<String, ?> urlVariables) {
		UriComponents expandedComponents = this.uriComponents.expand(urlVariables);		
		return expandedComponents.toUri();
	}

}
