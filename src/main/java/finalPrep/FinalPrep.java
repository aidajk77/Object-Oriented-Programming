package finalPrep;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FinalPrep {
    public static List<Book> loadBooks(String fileName){
        List<Book> books = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            int counter=0;
            while((line = br.readLine()) != null){
                if(counter == 0){
                    counter++;
                    continue;
                }
                String[] tokens = line.split(";");
                if(tokens[0] == "" || tokens[4] == "" || tokens[5] == "") {
                    throw new WrongFormatException("Values are empty",new ClassCastException());
                }
                books.add(
                        new Book.BookBuilder()
                                .setDate(new SimpleDateFormat("MM/dd/yyyy").parse(tokens[0]))
                                .setQuarter(tokens[1])
                                .setQtr(Integer.parseInt(tokens[2]))
                                .setYear(Integer.parseInt(tokens[3]))
                                .setCustomerId(tokens[4])
                                .setTotalAmount(Double.parseDouble(tokens[5]))
                                .setProfitPercentage(Double.parseDouble(tokens[6]))
                                .setProfitInr(Double.parseDouble(tokens[7]))
                                .setCostPrice(Double.parseDouble(tokens[8]))
                                .build()
                );
            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ParseException e){
            e.printStackTrace();
        }
        return books;
    }
}
