public class Search {

    public static void main(String[] args) {
        int[] nums = { 12, 23, 17, 23, 42, 99, 60, 9, 6, 80 };
        String[] countries = new String[] { "Afghanistan", "Albania", "Costa Rica", "Cote d'Ivoire",
                "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica",
                "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea",
                "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Algeria",
                "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "French Guiana", "French Polynesia",
                "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece",
                "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Jamaica", "Japan", "Jordan",
                "Kazakhstan", "Kenya", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize",
                "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island",
                "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi",
                "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad",
                "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo",
                "Congo, the Democratic Republic of the", "Cook Islands", "Finland", "France", "France Metropolitan",
                "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan",
                "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia",
                "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau",
                "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali",
                "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico",
                "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat",
                "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles",
                "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island",
                "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea",
                "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion",
                "Romania", "Russian Federation", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal",
                "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands",
                "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka",
                "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands",
                "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa",
                "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan",
                "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago",
                "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine",
                "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands",
                "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)",
                "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia",
                "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)",
                "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)",
                "Iraq", "Ireland", "Israel", "Italy", "Zambia", "Zimbabwe", "Palestine" };

        // iSelectionSort(nums);
        strMergeSort(countries, 0, countries.length - 1);

        // long startTime = System.nanoTime();
        // System.out.println(linearSearch(nums, 12));
        // long endTime = System.nanoTime();

        // long startTime1 = System.nanoTime();
        // System.out.println(binarySearch(nums, 12));
        // long endTime1 = System.nanoTime();

        // long elapsedTime = endTime - startTime;
        // long elapsedTime1 = endTime1 - startTime1;

        // System.out.println("Linear search: " + elapsedTime);
        // System.out.println("Binary search: " + elapsedTime1);

        System.out.println(printCountries(countries));
    }

    public static String printCountries(String[] arr) {
        String output = "";
        for (int i = 0; i < arr.length; i++) {
            output += arr[i] + ", ";
        }
        return output;
    }

    public static int linearSearch(int[] data, int query) {
        int index = 0;
        while (index < data.length) {
            if (data[index] == query) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] data, int query) {
        int lowerB = 0;
        int upperB = data.length - 1;
        while (upperB >= lowerB) {
            int middle = ((upperB - lowerB) / 2) + lowerB;
            if (data[middle] == query) {
                return middle;
            } else if (data[middle] > query) {
                upperB = middle - 1;
            } else {
                lowerB = middle + 1;
            }
        }
        return -1;
    }

    public static String strLinearSearch(String[] countries, String query) {
        int index = 0;
        while (index < countries.length) {
            if (countries[index].equals(query)) {
                return countries[index];
            } else {
                index++;
            }
        }
        return "-1";
    }

    public static String strBinarySearch(String[] countries, String query) {
        int lowerB = 0;
        int upperB = countries.length - 1;
        while (upperB >= lowerB) {
            int middle = ((upperB - lowerB) / 2) + lowerB;
            if (countries[middle].equals(query)) {
                return countries[middle];
            } else if (countries[middle].charAt(0) > query.charAt(0) && !countries[middle].equals(query)) {
                upperB = middle - 1;
            } else {
                lowerB = middle + 1;
            }
        }
        return "-1";
    }

    public static void iSelectionSort(int[] data) {
        for (int sortedIndex = 0; sortedIndex < data.length; sortedIndex++) {
            int smallestIndex = sortedIndex;
            for (int queryIndex = sortedIndex + 1; queryIndex < data.length; queryIndex++) {
                if (data[queryIndex] < data[smallestIndex]) {
                    smallestIndex = queryIndex;
                }
            }
            iSwap(data, smallestIndex, sortedIndex);
        }
    }

    public static void iSwap(int[] data, int leftIndex, int rightIndex) {
        int temp = data[leftIndex];
        data[leftIndex] = data[rightIndex];
        data[rightIndex] = temp;
    }

    public static void strMergeSort(String[] f, int lowerB, int upperB) {
        if (lowerB + 1 < upperB) {
            int mid = (upperB + lowerB) / 2;
            strMergeSort(f, lowerB, mid);
            strMergeSort(f, mid, upperB);
            strMerge(f, lowerB, mid, upperB);
        }
    }

    public static void strMerge(String f[], int lowerB, int mid, int upperB) {
        int i = lowerB;
        int j = mid;
        String temp[] = new String[upperB - lowerB];
        int t = 0;
        while (i < mid && j < upperB) {
            if (f[i].charAt(0) <= f[j].charAt(0)) {
                f[t] = f[i];
                i++;
                t++;
            } else {
                f[t] = f[j];
                j++;
                t++;
            }
        }
        while (i < mid) {
            f[t] = f[i];
            i++;
            t++;
        }
        while (j < upperB) {
            f[t] = f[j];
            j++;
            t++;
        }
        i = lowerB;
        t = 0;
        while (t < temp.length) {
            f[i] = f[t];
            i++;
            t++;
        }
    }
}

// TO BE COMPLETED