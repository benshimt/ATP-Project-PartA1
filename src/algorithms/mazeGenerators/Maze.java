package algorithms.mazeGenerators;

import java.util.Arrays;
import java.util.Random;

public class Maze {
    int row;
    int col;
    int[][] maze;
    Position start;
    Position exit;



    public Maze(int r, int c) {
        row=r;
        col=c;
        maze=new int[row][col];
        start=null;
        exit=null;

    }

    public void setmaze(int[][] Nmaze){
        maze=Nmaze;
    }

    public Position getStartPosition() {
        if (start == null && row>0 && col>0) {
            Random R = new Random();
            Position startP=new Position(R.nextInt(row), R.nextInt(col));
            start=startP;
            return start;
        } else {
            return start;
        }
    }

    public Position getGoalPosition() {
     if(exit==null && row>0 && col>0){
        Random R = new Random();
        boolean bool = false;


         while (bool) {
            if (maze[exitP.rowidx][exitP.colidx] == 0)
                bool = true;
            else {
                exitP = new Position(R.nextInt(row), R.nextInt(col));
            }
        }
        exit=exitP;
        return exit;}
     else{
         return exit;
            }

            }


     public void print(){
        for(int i=0;i<row;i++){
            System.out.println(Arrays.toString(maze[i]));
        }
     }

     Position chooseRandom(){
         Random R = new Random();
         int frame=R.nextInt(4);
         while (start.rowidx)ddv
             if (frame == 0) {

                 if (0 == start.rowidx&& R.nextInt(col) == start.colidx);
             } else if (frame == 1) {
                 Position exitP = new Position(99, R.nextInt(col));
             } else if (frame == 2) {
                 Position exitP = new Position(R.nextInt(row), 0);
             } else {
                 Position exitP = new Position(R.nextInt(row), 99);
             }
     }







    }


