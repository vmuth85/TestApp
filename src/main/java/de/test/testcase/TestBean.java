package de.test.testcase;

import java.io.Serializable;
import java.util.Date;
import javax.faces.view.ViewScoped;
import javax.inject.Named;



@Named
@ViewScoped
public class TestBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    /**
     * @return no magic, just the current date
     */
    public Date getCurrentDate() {
        return new Date();
    }
}
