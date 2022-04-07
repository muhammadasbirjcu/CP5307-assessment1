package com.asbir.cp5307.currencyconverter.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Symbols {
    protected static HashMap<String, Symbol> supported;

    public static HashMap<String, Symbol> getSupported(){
        if(supported != null){
        }else{
            supported = new HashMap();
            supported.put("AED", new Symbol("AED", "United Arab Emirates Dirham"));
            supported.put("AFN", new Symbol("AFN", "Afghan Afghani"));
            supported.put("ALL", new Symbol("ALL", "Albanian Lek"));
            supported.put("AMD", new Symbol("AMD", "Armenian Dram"));
            supported.put("ANG", new Symbol("ANG", "Netherlands Antillean Guilder"));
            supported.put("AOA", new Symbol("AOA", "Angolan Kwanza"));
            supported.put("ARS", new Symbol("ARS", "Argentine Peso"));
            supported.put("AUD", new Symbol("AUD", "Australian Dollar"));
            supported.put("AWG", new Symbol("AWG", "Aruban Florin"));
            supported.put("AZN", new Symbol("AZN", "Azerbaijani Manat"));
            supported.put("BAM", new Symbol("BAM", "Bosnia-Herzegovina Convertible Mark"));
            supported.put("BBD", new Symbol("BBD", "Barbadian Dollar"));
            supported.put("BDT", new Symbol("BDT", "Bangladeshi Taka"));
            supported.put("BGN", new Symbol("BGN", "Bulgarian Lev"));
            supported.put("BHD", new Symbol("BHD", "Bahraini Dinar"));
            supported.put("BIF", new Symbol("BIF", "Burundian Franc"));
            supported.put("BMD", new Symbol("BMD", "Bermudan Dollar"));
            supported.put("BND", new Symbol("BND", "Brunei Dollar"));
            supported.put("BOB", new Symbol("BOB", "Bolivian Boliviano"));
            supported.put("BRL", new Symbol("BRL", "Brazilian Real"));
            supported.put("BSD", new Symbol("BSD", "Bahamian Dollar"));
            supported.put("BTC", new Symbol("BTC", "Bitcoin"));
            supported.put("BTN", new Symbol("BTN", "Bhutanese Ngultrum"));
            supported.put("BWP", new Symbol("BWP", "Botswanan Pula"));
            supported.put("BYN", new Symbol("BYN", "New Belarusian Ruble"));
            supported.put("BYR", new Symbol("BYR", "Belarusian Ruble"));
            supported.put("BZD", new Symbol("BZD", "Belize Dollar"));
            supported.put("CAD", new Symbol("CAD", "Canadian Dollar"));
            supported.put("CDF", new Symbol("CDF", "Congolese Franc"));
            supported.put("CHF", new Symbol("CHF", "Swiss Franc"));
            supported.put("CLF", new Symbol("CLF", "Chilean Unit of Account (UF)"));
            supported.put("CLP", new Symbol("CLP", "Chilean Peso"));
            supported.put("CNY", new Symbol("CNY", "Chinese Yuan"));
            supported.put("COP", new Symbol("COP", "Colombian Peso"));
            supported.put("CRC", new Symbol("CRC", "Costa Rican Colón"));
            supported.put("CUC", new Symbol("CUC", "Cuban Convertible Peso"));
            supported.put("CUP", new Symbol("CUP", "Cuban Peso"));
            supported.put("CVE", new Symbol("CVE", "Cape Verdean Escudo"));
            supported.put("CZK", new Symbol("CZK", "Czech Republic Koruna"));
            supported.put("DJF", new Symbol("DJF", "Djiboutian Franc"));
            supported.put("DKK", new Symbol("DKK", "Danish Krone"));
            supported.put("DOP", new Symbol("DOP", "Dominican Peso"));
            supported.put("DZD", new Symbol("DZD", "Algerian Dinar"));
            supported.put("EGP", new Symbol("EGP", "Egyptian Pound"));
            supported.put("ERN", new Symbol("ERN", "Eritrean Nakfa"));
            supported.put("ETB", new Symbol("ETB", "Ethiopian Birr"));
            supported.put("EUR", new Symbol("EUR", "Euro"));
            supported.put("FJD", new Symbol("FJD", "Fijian Dollar"));
            supported.put("FKP", new Symbol("FKP", "Falkland Islands Pound"));
            supported.put("GBP", new Symbol("GBP", "British Pound Sterling"));
            supported.put("GEL", new Symbol("GEL", "Georgian Lari"));
            supported.put("GGP", new Symbol("GGP", "Guernsey Pound"));
            supported.put("GHS", new Symbol("GHS", "Ghanaian Cedi"));
            supported.put("GIP", new Symbol("GIP", "Gibraltar Pound"));
            supported.put("GMD", new Symbol("GMD", "Gambian Dalasi"));
            supported.put("GNF", new Symbol("GNF", "Guinean Franc"));
            supported.put("GTQ", new Symbol("GTQ", "Guatemalan Quetzal"));
            supported.put("GYD", new Symbol("GYD", "Guyanaese Dollar"));
            supported.put("HKD", new Symbol("HKD", "Hong Kong Dollar"));
            supported.put("HNL", new Symbol("HNL", "Honduran Lempira"));
            supported.put("HRK", new Symbol("HRK", "Croatian Kuna"));
            supported.put("HTG", new Symbol("HTG", "Haitian Gourde"));
            supported.put("HUF", new Symbol("HUF", "Hungarian Forint"));
            supported.put("IDR", new Symbol("IDR", "Indonesian Rupiah"));
            supported.put("ILS", new Symbol("ILS", "Israeli New Sheqel"));
            supported.put("IMP", new Symbol("IMP", "Manx pound"));
            supported.put("INR", new Symbol("INR", "Indian Rupee"));
            supported.put("IQD", new Symbol("IQD", "Iraqi Dinar"));
            supported.put("IRR", new Symbol("IRR", "Iranian Rial"));
            supported.put("ISK", new Symbol("ISK", "Icelandic Króna"));
            supported.put("JEP", new Symbol("JEP", "Jersey Pound"));
            supported.put("JMD", new Symbol("JMD", "Jamaican Dollar"));
            supported.put("JOD", new Symbol("JOD", "Jordanian Dinar"));
            supported.put("JPY", new Symbol("JPY", "Japanese Yen"));
            supported.put("KES", new Symbol("KES", "Kenyan Shilling"));
            supported.put("KGS", new Symbol("KGS", "Kyrgystani Som"));
            supported.put("KHR", new Symbol("KHR", "Cambodian Riel"));
            supported.put("KMF", new Symbol("KMF", "Comorian Franc"));
            supported.put("KPW", new Symbol("KPW", "North Korean Won"));
            supported.put("KRW", new Symbol("KRW", "South Korean Won"));
            supported.put("KWD", new Symbol("KWD", "Kuwaiti Dinar"));
            supported.put("KYD", new Symbol("KYD", "Cayman Islands Dollar"));
            supported.put("KZT", new Symbol("KZT", "Kazakhstani Tenge"));
            supported.put("LAK", new Symbol("LAK", "Laotian Kip"));
            supported.put("LBP", new Symbol("LBP", "Lebanese Pound"));
            supported.put("LKR", new Symbol("LKR", "Sri Lankan Rupee"));
            supported.put("LRD", new Symbol("LRD", "Liberian Dollar"));
            supported.put("LSL", new Symbol("LSL", "Lesotho Loti"));
            supported.put("LTL", new Symbol("LTL", "Lithuanian Litas"));
            supported.put("LVL", new Symbol("LVL", "Latvian Lats"));
            supported.put("LYD", new Symbol("LYD", "Libyan Dinar"));
            supported.put("MAD", new Symbol("MAD", "Moroccan Dirham"));
            supported.put("MDL", new Symbol("MDL", "Moldovan Leu"));
            supported.put("MGA", new Symbol("MGA", "Malagasy Ariary"));
            supported.put("MKD", new Symbol("MKD", "Macedonian Denar"));
            supported.put("MMK", new Symbol("MMK", "Myanma Kyat"));
            supported.put("MNT", new Symbol("MNT", "Mongolian Tugrik"));
            supported.put("MOP", new Symbol("MOP", "Macanese Pataca"));
            supported.put("MRO", new Symbol("MRO", "Mauritanian Ouguiya"));
            supported.put("MUR", new Symbol("MUR", "Mauritian Rupee"));
            supported.put("MVR", new Symbol("MVR", "Maldivian Rufiyaa"));
            supported.put("MWK", new Symbol("MWK", "Malawian Kwacha"));
            supported.put("MXN", new Symbol("MXN", "Mexican Peso"));
            supported.put("MYR", new Symbol("MYR", "Malaysian Ringgit"));
            supported.put("MZN", new Symbol("MZN", "Mozambican Metical"));
            supported.put("NAD", new Symbol("NAD", "Namibian Dollar"));
            supported.put("NGN", new Symbol("NGN", "Nigerian Naira"));
            supported.put("NIO", new Symbol("NIO", "Nicaraguan Córdoba"));
            supported.put("NOK", new Symbol("NOK", "Norwegian Krone"));
            supported.put("NPR", new Symbol("NPR", "Nepalese Rupee"));
            supported.put("NZD", new Symbol("NZD", "New Zealand Dollar"));
            supported.put("OMR", new Symbol("OMR", "Omani Rial"));
            supported.put("PAB", new Symbol("PAB", "Panamanian Balboa"));
            supported.put("PEN", new Symbol("PEN", "Peruvian Nuevo Sol"));
            supported.put("PGK", new Symbol("PGK", "Papua New Guinean Kina"));
            supported.put("PHP", new Symbol("PHP", "Philippine Peso"));
            supported.put("PKR", new Symbol("PKR", "Pakistani Rupee"));
            supported.put("PLN", new Symbol("PLN", "Polish Zloty"));
            supported.put("PYG", new Symbol("PYG", "Paraguayan Guarani"));
            supported.put("QAR", new Symbol("QAR", "Qatari Rial"));
            supported.put("RON", new Symbol("RON", "Romanian Leu"));
            supported.put("RSD", new Symbol("RSD", "Serbian Dinar"));
            supported.put("RUB", new Symbol("RUB", "Russian Ruble"));
            supported.put("RWF", new Symbol("RWF", "Rwandan Franc"));
            supported.put("SAR", new Symbol("SAR", "Saudi Riyal"));
            supported.put("SBD", new Symbol("SBD", "Solomon Islands Dollar"));
            supported.put("SCR", new Symbol("SCR", "Seychellois Rupee"));
            supported.put("SDG", new Symbol("SDG", "Sudanese Pound"));
            supported.put("SEK", new Symbol("SEK", "Swedish Krona"));
            supported.put("SGD", new Symbol("SGD", "Singapore Dollar"));
            supported.put("SHP", new Symbol("SHP", "Saint Helena Pound"));
            supported.put("SLL", new Symbol("SLL", "Sierra Leonean Leone"));
            supported.put("SOS", new Symbol("SOS", "Somali Shilling"));
            supported.put("SRD", new Symbol("SRD", "Surinamese Dollar"));
            supported.put("STD", new Symbol("STD", "São Tomé and Príncipe Dobra"));
            supported.put("SVC", new Symbol("SVC", "Salvadoran Colón"));
            supported.put("SYP", new Symbol("SYP", "Syrian Pound"));
            supported.put("SZL", new Symbol("SZL", "Swazi Lilangeni"));
            supported.put("THB", new Symbol("THB", "Thai Baht"));
            supported.put("TJS", new Symbol("TJS", "Tajikistani Somoni"));
            supported.put("TMT", new Symbol("TMT", "Turkmenistani Manat"));
            supported.put("TND", new Symbol("TND", "Tunisian Dinar"));
            supported.put("TOP", new Symbol("TOP", "Tongan Paʻanga"));
            supported.put("TRY", new Symbol("TRY", "Turkish Lira"));
            supported.put("TTD", new Symbol("TTD", "Trinidad and Tobago Dollar"));
            supported.put("TWD", new Symbol("TWD", "New Taiwan Dollar"));
            supported.put("TZS", new Symbol("TZS", "Tanzanian Shilling"));
            supported.put("UAH", new Symbol("UAH", "Ukrainian Hryvnia"));
            supported.put("UGX", new Symbol("UGX", "Ugandan Shilling"));
            supported.put("USD", new Symbol("USD", "United States Dollar"));
            supported.put("UYU", new Symbol("UYU", "Uruguayan Peso"));
            supported.put("UZS", new Symbol("UZS", "Uzbekistan Som"));
            supported.put("VEF", new Symbol("VEF", "Venezuelan Bolívar Fuerte"));
            supported.put("VND", new Symbol("VND", "Vietnamese Dong"));
            supported.put("VUV", new Symbol("VUV", "Vanuatu Vatu"));
            supported.put("WST", new Symbol("WST", "Samoan Tala"));
            supported.put("XAF", new Symbol("XAF", "CFA Franc BEAC"));
            supported.put("XAG", new Symbol("XAG", "Silver (troy ounce)"));
            supported.put("XAU", new Symbol("XAU", "Gold (troy ounce)"));
            supported.put("XCD", new Symbol("XCD", "East Caribbean Dollar"));
            supported.put("XDR", new Symbol("XDR", "Special Drawing Rights"));
            supported.put("XOF", new Symbol("XOF", "CFA Franc BCEAO"));
            supported.put("XPF", new Symbol("XPF", "CFP Franc"));
            supported.put("YER", new Symbol("YER", "Yemeni Rial"));
            supported.put("ZAR", new Symbol("ZAR", "South African Rand"));
            supported.put("ZMK", new Symbol("ZMK", "Zambian Kwacha (pre-2013)"));
            supported.put("ZMW", new Symbol("ZMW", "Zambian Kwacha"));
            supported.put("ZWL", new Symbol("ZWL", "Zimbabwean Dollar"));
        }

        return supported;
    }

    public static ArrayList<String> getSupportedArray() {
        ArrayList<String> arr = new ArrayList<>();
        HashMap<String, Symbol> supported = getSupported();
        for(String key : supported.keySet()){
            arr.add(supported.get(key).getCodeAndCountry());
        }
        return arr;
    }

    public static Integer getIndex(String code) {
        Iterator it = getSupported().entrySet().iterator();
        Integer index = -1;
        while (it.hasNext()) {
            index++;
            Map.Entry pair = (Map.Entry)it.next();
            if(pair.getKey().toString().toLowerCase().equals(code.toLowerCase())){
                break;
            }
        }
        return index;
    }
}
