package hw.ch12;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private List<String> strings = new ArrayList<>();
    private int columns = 0;
 
    public void add(String s) {
        strings.add(s);
        if (s.length() > columns) {
            columns = s.length();
        }
    }
 
    @Override
    public int getColumns() {
        return columns;
    }
 
    @Override
    public int getRows() {
        return strings.size();
    }
 
    @Override
    public String getRowText(int row) {
        String s = strings.get(row);
        // 최대 폭에 맞춰 공백 패딩
        return s + " ".repeat(columns - s.length());
    }
}