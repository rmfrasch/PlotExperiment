package base;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import base.beans.Corn;
import base.beans.FieldDetails;
import base.controller.BeanConfiguration;
import base.repository.FieldRepository;

@SpringBootApplication
public class PlotExperimentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PlotExperimentApplication.class, args);
	}
	@Autowired
	FieldRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		FieldDetails fd = appContext.getBean("fieldDetails", FieldDetails.class);
		fd.setPlotPopulation(35000);
		repo.save(fd);
		
		FieldDetails d = new FieldDetails(34560, 4, 20);
		Corn c = new Corn(102, true, false);
		d.setCorn(c);;
		repo.save(d);
		
		List<FieldDetails> allMyFields = repo.findAll();
		for(FieldDetails fields: allMyFields) {
			System.out.println(fields.toString());
		}
	}
}
