package Board;

import java.util.concurrent.ExecutionException;

public abstract class AbstractBoard {
    protected int[][] boardFields = new int[][] {
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0}
    };
    protected void resetBoard(){
        boardFields = new int[][] {
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0}};
    }

    protected void setBoardElement(int x, int y, int value){
        boardFields[y][x] = value;
    }

    public int getBoardLength(){
        return boardFields.length;
    }
    public int getElementValueByBoardCoords(String x, int y){
        int intX = -1;
        if(x.equals("A")) intX = 0;
        else if(x.equals("B")) intX = 1;
        else if(x.equals("C")) intX = 2;
        else if(x.equals("D")) intX = 3;
        else if(x.equals("E")) intX = 4;
        else if(x.equals("F")) intX = 5;
        else if(x.equals("G")) intX = 6;
        else if(x.equals("H")) intX = 7;
        //else throw new ExecutionException();
        return boardFields[y][intX];
    }
    public int getElementValueByTableCoords(int x, int y){
        return boardFields[y][x];
    }

    abstract void changePosition();
    public abstract void updatePositions();

}
