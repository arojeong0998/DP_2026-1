package hw.ch12;

public class NumberedBorder extends Border {
 
    public NumberedBorder(Display display) {
        super(display);
    }
 
    @Override
    public int getColumns() {
        // 행 번호 형식 "%2d|" = 3글자 추가
        return 3 + display.getColumns();
    }
 
    @Override
    public int getRows() {
        return display.getRows();
    }
 
    @Override
    public String getRowText(int row) {
        // 행 번호는 1부터 시작, %2d| 형식
        return String.format("%2d|", row + 1) + display.getRowText(row);
    }
}
 