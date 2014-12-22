/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fr.xebia.cloud.data.customer;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Customer {

    @Id
    private String mail;
    private String firstName;
    private String lastName;
    private DocumentType documentType;
    private Date date;

    private Customer() {}

    public String getMail() {
        return mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public CustomerAdaptor toES() {
        final CustomerAdaptor customerES = new CustomerAdaptor();
        customerES.setFirst(firstName);
        customerES.setLast(lastName);
        customerES.setMail(mail);
        customerES.setTimestamp(date);
        customerES.setDocumentType(documentType);
        return customerES;
    }

    public static class Builder {

        private String mail;

        private String firstName;
        private String lastName;
        private DocumentType documentType;
        private Date date;

        public Builder withMail(String mail) {
            this.mail = mail;
            return this;
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withDocumentType(DocumentType documentType) {
            this.documentType = documentType;
            return this;
        }

        public Builder withDate(Date date) {
            this.date = date;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer();
            customer.mail = mail;
            customer.firstName = firstName;
            customer.lastName = lastName;
            customer.documentType = documentType;
            customer.date = date;
            return customer;
        }

    }

    @Override
    public String toString() {
        return String.format("Customer[id=%s, firstName='%s', lastName='%s', type='%s']", getMail(),
                getFirstName(), getLastName(), getDocumentType());
    }
}
