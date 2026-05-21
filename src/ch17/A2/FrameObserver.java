package ch17.A2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameObserver extends Frame implements Observer, ActionListener {
    // GraphText는 통지된 수를 텍스트 필드로 표시하는 static 클래스 
    static class GraphText extends TextField implements Observer {
        public GraphText(int columns) {
            super(columns);
        }

        @Override
        public void update(NumberGenerator generator) {
            int number = generator.getNumber();
            String text = number + ":";
            for (int i = 0; i < number; i++) {
                text += '*';
            }
            setText(text);
        }
    }

    // GraphCanvas는 통지된 수를 원그래프로 표시하는 static 클래스 
    static class GraphCanvas extends Canvas implements Observer {
        private int number;

        @Override
        public void update(NumberGenerator generator) {
            number = generator.getNumber();
            repaint(); // paint() 도화지를 클리어하고 페인트 메소드를 호출하는 것
            // 다시 그리도로 요청한다.
        }

        public void paint(Graphics g) { //그레픽스라는 인자로 메소드를 호출한다. 
            int width = getWidth();
            int height = getHeight();

            //아래 흰색 원 
            g.setColor(Color.white);
            g.fillArc(0, 0, width, height, 0, 360);

            //빨간색 원호 
            g.setColor(Color.red);
            g.fillArc(0, 0, width, height, 90, - number * 360 / 50);
        }
    }

    private GraphText textGraph = new GraphText(60);
    private GraphCanvas canvasGraph = new GraphCanvas();
    private Button buttonClose = new Button("Close");

    public FrameObserver() {
        super("FrameObserver"); // 프레임의 제목을 설정한다.
        setLayout(new BorderLayout()); // 프레임의 레이아웃을 BorderLayout으로 설정한다.
        setBackground(Color.lightGray); // 프레임의 배경색을 연한 회색으로 설정한다.
        textGraph.setEditable(false); 
        canvasGraph.setSize(500, 500);
        add(textGraph, BorderLayout.NORTH);
        add(canvasGraph, BorderLayout.CENTER);
        add(buttonClose, BorderLayout.SOUTH);
        buttonClose.addActionListener(this);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }

    @Override
    public void update(NumberGenerator generator) {
        textGraph.update(generator);
        canvasGraph.update(generator);
    }
}

