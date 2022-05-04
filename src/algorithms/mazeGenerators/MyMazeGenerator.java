package algorithms.mazeGenerators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyMazeGenerator extends AmazeGenerator {
   public Maze generate(int r,int c){
        //initiate new maze and sel all it's cells with 1 as walls.
        Maze maze = new Maze(r, c);
        maze.setmaze(all1maze(r,c));

        //select random start point.
       Cell start = selectStartP(maze);

       Cell curr;
       int count; //num of visited neighbors for current cell.

       //frontiers list , candidates to be selected as the next cell in the maze.
       List<Cell> Flist= new ArrayList<>();
       Flist.add(start);

        while (!Flist.isEmpty()){
            Random R = new Random( );
            curr=Flist.remove(R.nextInt(Flist.size()));
            count=countVisitedN(maze,curr);

            if(count<=1){
                maze.maze[curr.getRowidx()][curr.getColidx()]=0;

                //down
                addValidFrontier(curr.getRowidx()+1, curr.getColidx(), maze,Flist);
                //up
                addValidFrontier(curr.getRowidx()-1, curr.getColidx(), maze,Flist);
                //left
                addValidFrontier(curr.getRowidx(), curr.getColidx()-1, maze,Flist);
                //right
                addValidFrontier(curr.getRowidx(), curr.getColidx()+1, maze,Flist);
            }

        }
        return maze;}

   private int[][] all1maze(int r,int c) {
        int[][] Nmaze = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Nmaze[i][j] = 1;
            }
        }
    return Nmaze;}


    private Cell selectStartP(Maze maze){
        Random R = new Random( );
        return new Cell(R.nextInt(maze.col* maze.row),R.nextInt(maze.col* maze.row));

    }
    //return the count of visited neighbors for a cell.
   private int countVisitedN(Maze m,Cell curr){
       int Ncount=0;
       //down
       if(curr.getColidx()<=m.col-1 && curr.getRowidx()+1<m.row-1 && m.maze[curr.getColidx()][curr.getRowidx()+1]==0)
           Ncount++;
       //up
       if(curr.getColidx()<=m.col-1 && curr.getRowidx()-1<m.row-1 && m.maze[curr.getColidx()][curr.getRowidx()-1]==0)
           Ncount++;
       //right
       if(curr.getColidx()+1<=m.col-1 && curr.getRowidx()<m.row-1 && m.maze[curr.getColidx()+1][curr.getRowidx()]==0)
           Ncount++;
       //left
       if(curr.getColidx()-1<=m.col-1 && curr.getRowidx()<m.row-1 && m.maze[curr.getColidx()-1][curr.getRowidx()]==0)
           Ncount++;
       return Ncount;}

    private void addValidFrontier(int r, int c, Maze m,List<Cell> frontiers){
        if(c<=m.col-1 && r<m.row-1 && m.maze[r][c]==0){
            frontiers.add(new Cell(r,c));
        }

    }

    /*
    private boolean isValidCell(Maze m,Cell c){
       //down
        if(c.getColidx()<=m.col-1 && c.getRowidx()+1<m.row-1)
            return true;
        //up
        if(c.getColidx()<=m.col-1 && c.getRowidx()-1<m.row-1)
            return true;
        //right
        if(c.getColidx()<=m.col-1 && c.getRowidx()+1<m.row-1)
            return true;
        //left
        if(c.getColidx()<=m.col-1 && c.getRowidx()+1<m.row-1)
            return true;
        return false;

    }

     */
}