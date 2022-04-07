package com.asbir.cp5307.currencyconverter.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SymbolsArray extends ArrayList<Symbol> {

    protected static SymbolsArray supported;

    public static SymbolsArray getSupported(){
        if(supported != null){
        }else{
            supported = new SymbolsArray();
            supported.add( new Symbol("USD", "United States Dollar"));
            supported.add( new Symbol("AUD", "Australian Dollar"));
            supported.add( new Symbol("EUR", "Euro"));

            supported.add( new Symbol("AED", "United Arab Emirates Dirham"));
            supported.add( new Symbol("AFN", "Afghan Afghani"));
            supported.add( new Symbol("ALL", "Albanian Lek"));
            supported.add( new Symbol("AMD", "Armenian Dram"));
            supported.add( new Symbol("ANG", "Netherlands Antillean Guilder"));
            supported.add( new Symbol("AOA", "Angolan Kwanza"));
            supported.add( new Symbol("ARS", "Argentine Peso"));
            supported.add( new Symbol("AWG", "Aruban Florin"));
            supported.add( new Symbol("AZN", "Azerbaijani Manat"));
            supported.add( new Symbol("BAM", "Bosnia-Herzegovina Convertible Mark"));
            supported.add( new Symbol("BBD", "Barbadian Dollar"));
            supported.add( new Symbol("BDT", "Bangladeshi Taka"));
            supported.add( new Symbol("BGN", "Bulgarian Lev"));
            supported.add( new Symbol("BHD", "Bahraini Dinar"));
            supported.add( new Symbol("BIF", "Burundian Franc"));
            supported.add( new Symbol("BMD", "Bermudan Dollar"));
            supported.add( new Symbol("BND", "Brunei Dollar"));
            supported.add( new Symbol("BOB", "Bolivian Boliviano"));
            supported.add( new Symbol("BRL", "Brazilian Real"));
            supported.add( new Symbol("BSD", "Bahamian Dollar"));
            supported.add( new Symbol("BTC", "Bitcoin"));
            supported.add( new Symbol("BTN", "Bhutanese Ngultrum"));
            supported.add( new Symbol("BWP", "Botswanan Pula"));
            supported.add( new Symbol("BYN", "New Belarusian Ruble"));
            supported.add( new Symbol("BYR", "Belarusian Ruble"));
            supported.add( new Symbol("BZD", "Belize Dollar"));
            supported.add( new Symbol("CAD", "Canadian Dollar"));
            supported.add( new Symbol("CDF", "Congolese Franc"));
            supported.add( new Symbol("CHF", "Swiss Franc"));
            supported.add( new Symbol("CLF", "Chilean Unit of Account (UF)"));
            supported.add( new Symbol("CLP", "Chilean Peso"));
            supported.add( new Symbol("CNY", "Chinese Yuan"));
            supported.add( new Symbol("COP", "Colombian Peso"));
            supported.add( new Symbol("CRC", "Costa Rican Colón"));
            supported.add( new Symbol("CUC", "Cuban Convertible Peso"));
            supported.add( new Symbol("CUP", "Cuban Peso"));
            supported.add( new Symbol("CVE", "Cape Verdean Escudo"));
            supported.add( new Symbol("CZK", "Czech Republic Koruna"));
            supported.add( new Symbol("DJF", "Djiboutian Franc"));
            supported.add( new Symbol("DKK", "Danish Krone"));
            supported.add( new Symbol("DOP", "Dominican Peso"));
            supported.add( new Symbol("DZD", "Algerian Dinar"));
            supported.add( new Symbol("EGP", "Egyptian Pound"));
            supported.add( new Symbol("ERN", "Eritrean Nakfa"));
            supported.add( new Symbol("ETB", "Ethiopian Birr"));
            supported.add( new Symbol("FJD", "Fijian Dollar"));
            supported.add( new Symbol("FKP", "Falkland Islands Pound"));
            supported.add( new Symbol("GBP", "British Pound Sterling"));
            supported.add( new Symbol("GEL", "Georgian Lari"));
            supported.add( new Symbol("GGP", "Guernsey Pound"));
            supported.add( new Symbol("GHS", "Ghanaian Cedi"));
            supported.add( new Symbol("GIP", "Gibraltar Pound"));
            supported.add( new Symbol("GMD", "Gambian Dalasi"));
            supported.add( new Symbol("GNF", "Guinean Franc"));
            supported.add( new Symbol("GTQ", "Guatemalan Quetzal"));
            supported.add( new Symbol("GYD", "Guyanaese Dollar"));
            supported.add( new Symbol("HKD", "Hong Kong Dollar"));
            supported.add( new Symbol("HNL", "Honduran Lempira"));
            supported.add( new Symbol("HRK", "Croatian Kuna"));
            supported.add( new Symbol("HTG", "Haitian Gourde"));
            supported.add( new Symbol("HUF", "Hungarian Forint"));
            supported.add( new Symbol("IDR", "Indonesian Rupiah"));
            supported.add( new Symbol("ILS", "Israeli New Sheqel"));
            supported.add( new Symbol("IMP", "Manx pound"));
            supported.add( new Symbol("INR", "Indian Rupee"));
            supported.add( new Symbol("IQD", "Iraqi Dinar"));
            supported.add( new Symbol("IRR", "Iranian Rial"));
            supported.add( new Symbol("ISK", "Icelandic Króna"));
            supported.add( new Symbol("JEP", "Jersey Pound"));
            supported.add( new Symbol("JMD", "Jamaican Dollar"));
            supported.add( new Symbol("JOD", "Jordanian Dinar"));
            supported.add( new Symbol("JPY", "Japanese Yen"));
            supported.add( new Symbol("KES", "Kenyan Shilling"));
            supported.add( new Symbol("KGS", "Kyrgystani Som"));
            supported.add( new Symbol("KHR", "Cambodian Riel"));
            supported.add( new Symbol("KMF", "Comorian Franc"));
            supported.add( new Symbol("KPW", "North Korean Won"));
            supported.add( new Symbol("KRW", "South Korean Won"));
            supported.add( new Symbol("KWD", "Kuwaiti Dinar"));
            supported.add( new Symbol("KYD", "Cayman Islands Dollar"));
            supported.add( new Symbol("KZT", "Kazakhstani Tenge"));
            supported.add( new Symbol("LAK", "Laotian Kip"));
            supported.add( new Symbol("LBP", "Lebanese Pound"));
            supported.add( new Symbol("LKR", "Sri Lankan Rupee"));
            supported.add( new Symbol("LRD", "Liberian Dollar"));
            supported.add( new Symbol("LSL", "Lesotho Loti"));
            supported.add( new Symbol("LTL", "Lithuanian Litas"));
            supported.add( new Symbol("LVL", "Latvian Lats"));
            supported.add( new Symbol("LYD", "Libyan Dinar"));
            supported.add( new Symbol("MAD", "Moroccan Dirham"));
            supported.add( new Symbol("MDL", "Moldovan Leu"));
            supported.add( new Symbol("MGA", "Malagasy Ariary"));
            supported.add( new Symbol("MKD", "Macedonian Denar"));
            supported.add( new Symbol("MMK", "Myanma Kyat"));
            supported.add( new Symbol("MNT", "Mongolian Tugrik"));
            supported.add( new Symbol("MOP", "Macanese Pataca"));
            supported.add( new Symbol("MRO", "Mauritanian Ouguiya"));
            supported.add( new Symbol("MUR", "Mauritian Rupee"));
            supported.add( new Symbol("MVR", "Maldivian Rufiyaa"));
            supported.add( new Symbol("MWK", "Malawian Kwacha"));
            supported.add( new Symbol("MXN", "Mexican Peso"));
            supported.add( new Symbol("MYR", "Malaysian Ringgit"));
            supported.add( new Symbol("MZN", "Mozambican Metical"));
            supported.add( new Symbol("NAD", "Namibian Dollar"));
            supported.add( new Symbol("NGN", "Nigerian Naira"));
            supported.add( new Symbol("NIO", "Nicaraguan Córdoba"));
            supported.add( new Symbol("NOK", "Norwegian Krone"));
            supported.add( new Symbol("NPR", "Nepalese Rupee"));
            supported.add( new Symbol("NZD", "New Zealand Dollar"));
            supported.add( new Symbol("OMR", "Omani Rial"));
            supported.add( new Symbol("PAB", "Panamanian Balboa"));
            supported.add( new Symbol("PEN", "Peruvian Nuevo Sol"));
            supported.add( new Symbol("PGK", "Papua New Guinean Kina"));
            supported.add( new Symbol("PHP", "Philippine Peso"));
            supported.add( new Symbol("PKR", "Pakistani Rupee"));
            supported.add( new Symbol("PLN", "Polish Zloty"));
            supported.add( new Symbol("PYG", "Paraguayan Guarani"));
            supported.add( new Symbol("QAR", "Qatari Rial"));
            supported.add( new Symbol("RON", "Romanian Leu"));
            supported.add( new Symbol("RSD", "Serbian Dinar"));
            supported.add( new Symbol("RUB", "Russian Ruble"));
            supported.add( new Symbol("RWF", "Rwandan Franc"));
            supported.add( new Symbol("SAR", "Saudi Riyal"));
            supported.add( new Symbol("SBD", "Solomon Islands Dollar"));
            supported.add( new Symbol("SCR", "Seychellois Rupee"));
            supported.add( new Symbol("SDG", "Sudanese Pound"));
            supported.add( new Symbol("SEK", "Swedish Krona"));
            supported.add( new Symbol("SGD", "Singapore Dollar"));
            supported.add( new Symbol("SHP", "Saint Helena Pound"));
            supported.add( new Symbol("SLL", "Sierra Leonean Leone"));
            supported.add( new Symbol("SOS", "Somali Shilling"));
            supported.add( new Symbol("SRD", "Surinamese Dollar"));
            supported.add( new Symbol("STD", "São Tomé and Príncipe Dobra"));
            supported.add( new Symbol("SVC", "Salvadoran Colón"));
            supported.add( new Symbol("SYP", "Syrian Pound"));
            supported.add( new Symbol("SZL", "Swazi Lilangeni"));
            supported.add( new Symbol("THB", "Thai Baht"));
            supported.add( new Symbol("TJS", "Tajikistani Somoni"));
            supported.add( new Symbol("TMT", "Turkmenistani Manat"));
            supported.add( new Symbol("TND", "Tunisian Dinar"));
            supported.add( new Symbol("TOP", "Tongan Paʻanga"));
            supported.add( new Symbol("TRY", "Turkish Lira"));
            supported.add( new Symbol("TTD", "Trinidad and Tobago Dollar"));
            supported.add( new Symbol("TWD", "New Taiwan Dollar"));
            supported.add( new Symbol("TZS", "Tanzanian Shilling"));
            supported.add( new Symbol("UAH", "Ukrainian Hryvnia"));
            supported.add( new Symbol("UGX", "Ugandan Shilling"));
            supported.add( new Symbol("UYU", "Uruguayan Peso"));
            supported.add( new Symbol("UZS", "Uzbekistan Som"));
            supported.add( new Symbol("VEF", "Venezuelan Bolívar Fuerte"));
            supported.add( new Symbol("VND", "Vietnamese Dong"));
            supported.add( new Symbol("VUV", "Vanuatu Vatu"));
            supported.add( new Symbol("WST", "Samoan Tala"));
            supported.add( new Symbol("XAF", "CFA Franc BEAC"));
            supported.add( new Symbol("XAG", "Silver (troy ounce)"));
            supported.add( new Symbol("XAU", "Gold (troy ounce)"));
            supported.add( new Symbol("XCD", "East Caribbean Dollar"));
            supported.add( new Symbol("XDR", "Special Drawing Rights"));
            supported.add( new Symbol("XOF", "CFA Franc BCEAO"));
            supported.add( new Symbol("XPF", "CFP Franc"));
            supported.add( new Symbol("YER", "Yemeni Rial"));
            supported.add( new Symbol("ZAR", "South African Rand"));
            supported.add( new Symbol("ZMK", "Zambian Kwacha (pre-2013)"));
            supported.add( new Symbol("ZMW", "Zambian Kwacha"));
            supported.add( new Symbol("ZWL", "Zimbabwean Dollar"));
        }

        return supported;
    }

    public Integer getIndexOf(String code) {
        Integer indexMatch = -1;
        for(Integer x = 0; x < this.size(); x++){
            if(get(x).code.toLowerCase().equals(code.toLowerCase())){
                indexMatch = x;
                break;
            }
        }
        return indexMatch;
    }

    public ArrayList<String> mapCodeAndCountry() {
        ArrayList<String> arr = new ArrayList<>();
        for(Integer x = 0; x < this.size(); x++) {
            arr.add(this.get(x).getCodeAndCountry());
        }
        return arr;
    }
    public SymbolsMap keyByCode() {
        SymbolsMap mapped = new SymbolsMap();
        for(Integer x = 0; x < this.size(); x++){
            mapped.put(this.get(x).getCode(), this.get(x));
        }
        return mapped;
    }
}
