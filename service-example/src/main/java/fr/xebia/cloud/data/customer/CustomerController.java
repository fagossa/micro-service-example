package fr.xebia.cloud.data.customer;

import fr.xebia.cloud.data.customer.Customer;
import fr.xebia.cloud.data.customer.CustomerAdaptor;
import fr.xebia.cloud.data.customer.CustomerESRepository;
import fr.xebia.cloud.data.customer.DocumentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by fagossa on 09/12/2014.
 */
@RestController
public class CustomerController {

    @Autowired
    private CustomerESRepository repository;

    @RequestMapping(value="/customer", method= RequestMethod.GET)
    public Customer execute() throws Exception {
        final Customer customer = new Customer.Builder()
                .withMail("carlos.valderrama@gmail.com")
                .withFirstName("carlos")
                .withLastName("valderrama")
                .withDocumentType(DocumentType.getRandomValue())
                .build();
//        repository.save(customer.toES());

        final List<CustomerAdaptor> byFirst = repository.findByFirst("carlos");
        System.out.println(byFirst);
        return customer;
    }

    @RequestMapping(value="/batch", method= RequestMethod.GET)
    public void executeBatch() throws Exception {
        for (int i=0 ; i < 10 ;i ++) {
            StringBuilder name= new StringBuilder("person")
                    .append("_")
                    .append(i)
                    .append("@gmail.com");

            final Customer customer = new Customer.Builder()
                    .withMail(name.toString())
                    .withFirstName("carlos")
                    .withLastName("perez")
                    .withDate(new Date())
                    .withDocumentType(DocumentType.getRandomValue())
                    .build();
            repository.save(customer.toES());

        }
    }

}
