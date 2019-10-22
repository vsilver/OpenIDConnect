package Model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataSet {

    private String source;
    private Data data;

    public String getSource()
    {
        return source;
    }

    public DataSet setSource(String source)
    {
        this.source = source;
        return this;
    }

    public Data getData()
    {
        return data;
    }

    public DataSet setData(Data data)
    {
        this.data = data;
        return this;
    }

    @Override
    public String toString()
    {
        return " Data Set [source = "+source+", data = "+data+"]";
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Data
    {
        private String unid;
        private String firstName;
        private String lastName;
        private String emailAddress;
        private String phoneNumber;
        private String countryCode;
        private String consentForDetails;
        private String marketingConsent;

        public String getUnid()
        {
            return unid;
        }

        public Data setUnid(String unid)
        {
            this.unid = unid;
            return this;
        }

        public String getFirstName()
        {
            return firstName;
        }

        public Data setFirstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public String getLastName()
        {
            return lastName;
        }

        public Data setLastName(String lastName)
        {
            this.lastName = lastName;
            return  this;
        }

        public String getEmailAddress()
        {
            return emailAddress;
        }

        public Data setEmailAddress(String emailAddress)
        {
            this.emailAddress = emailAddress;
            return  this;
        }

        public String getPhoneNumber()
        {
            return phoneNumber;
        }

        public Data setPhoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public String getCountryCode()
        {
            return countryCode;
        }

        public Data setCountryCode(String countryCode)
        {
            this.countryCode = countryCode;
            return this;
        }

        public String getConsentForDetails()
        {
            return consentForDetails;
        }

        public Data setConsentForDetails(String consentForDetails)
        {
            this.consentForDetails = consentForDetails;
            return  this;
        }

        public String getMarketingConsent()
        {
            return marketingConsent;
        }

        public Data setMarketingConsent(String marketingConsent)
        {
            this.marketingConsent = marketingConsent;
            return this;
        }

    }

    }
