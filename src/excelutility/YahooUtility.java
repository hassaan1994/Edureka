package excelutility;

import java.util.ArrayList;

public class YahooUtility {

    static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel() {
        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            reader = new Xls_Reader("\\Users\\hassa\\OneDrive\\Desktop\\SeleniumCourse\\FacebookSignUpData.xlsx");
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int rowNum = 2; rowNum <= reader.getRowCount("FacebookSignUpData"); rowNum++) {

            String firstname = reader.getCellData("FacebookSignUpData", "First name", rowNum);


            String lastname = reader.getCellData("FacebookSignUpData", "Last name", rowNum);


            String email = reader.getCellData("FacebookSignUpData", "Email", rowNum);


            String password = reader.getCellData("FacebookSignUpData", "Password", rowNum);


            String month = reader.getCellData("FacebookSignUpData", "Month", rowNum);


            String day = reader.getCellData("FacebookSignUpData", "Day", rowNum);


            String year = reader.getCellData("FacebookSignUpData", "Year", rowNum);


            String gender = reader.getCellData("FacebookSignUpData", "Gender", rowNum);

            Object ob[] = {firstname, lastname, email, password, month, day, year, gender};

            myData.add(ob);
        }

        return myData;
    }


}
