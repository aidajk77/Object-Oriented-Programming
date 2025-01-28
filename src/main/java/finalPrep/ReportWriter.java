package finalPrep;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class ReportWriter {
    public static void writeReport(String outputFile, List<Book> books){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write("Date,Quarter,Qtr,Year,Customer ID,Total_amount,Profit Percentage(%),Profit (INR),Cost Price \n");
            Class clazz = Book.class;
            Field[] fields = clazz.getDeclaredFields();
            for (Book book : books) {
                for (Field field : fields) {
                    field.setAccessible(true);
                    if(field.getName().equals("costPrice")){
                        writer.write(field.get(book).toString());
                    }else {
                        if(field.isAnnotationPresent(WriteConcerns.class)) {
                            if(field.get(book) instanceof String){
                                WriteConcerns wc = field.getAnnotation(WriteConcerns.class);
                                CaseFormatter cf = wc.caseFormatter();
                                switch (cf){
                                    case ORDINARY -> writer.write(field.get(book).toString() + ",");
                                    case UPPER_CASE -> writer.write(field.get(book).toString().toUpperCase() + ",");
                                    case LOWER_CASE -> writer.write(field.get(book).toString().toLowerCase() + ",");
                                }

                            } else{
                                WriteConcerns wc = field.getAnnotation(WriteConcerns.class);
                                NumberFormatter nf = wc.numberFormater();
                                switch (nf){
                                    case COMMA -> writer.write(field.get(book).toString() + ",");
                                    case PERCENTAGE -> writer.write(field.get(book).toString() + "%,");
                                }
                            }
                        }
                    }
                }
                writer.newLine();
            }
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
