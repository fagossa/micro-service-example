package fr.xebia.cloud.data.customer;

//import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by fagossa on 12/11/2014.
 */
public class Invoice {

    //@Id
    private String id;

    private BigDecimal value;
    private Date date;

    public Invoice() {
    }
}
