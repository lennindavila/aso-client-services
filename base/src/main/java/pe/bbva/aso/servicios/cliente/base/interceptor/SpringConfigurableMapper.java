package pe.bbva.aso.servicios.cliente.base.interceptor;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import ma.glasnost.orika.Converter;
import ma.glasnost.orika.Mapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component
public class SpringConfigurableMapper extends ConfigurableMapper {

	private ApplicationContext applicationContext;

	private MapperFactory mapperFactory;

	@Autowired
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
		addSpringMappers();
		addSpringConverter();
	}

	@Override
	protected void configure(MapperFactory factory) {
		super.configure(factory);
		this.mapperFactory = factory;
	}

	private void addSpringMappers() {
		@SuppressWarnings("rawtypes")
		final Map<String, Mapper> mappers = applicationContext.getBeansOfType(Mapper.class);
		for (final Mapper<?, ?> mapper : mappers.values()) {
			addMapper(mapper);
		}
	}

	private void addMapper(Mapper<?, ?> mapper) {
		this.mapperFactory.registerMapper(mapper);
	}

	@SuppressWarnings("rawtypes")
	private void addSpringConverter() {
		final Map<String, Converter> converters = applicationContext.getBeansOfType(Converter.class);
		for (final Converter<?, ?> converter : converters.values()) {
			addConverter(converter);
		}
	}

	private void addConverter(Converter<?, ?> converter) {
		this.mapperFactory.getConverterFactory().registerConverter(converter);
	}

}
