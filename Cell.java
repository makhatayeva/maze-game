package Maze_Game_1;

import java.io.Serializable;


/**
 *
 * Teacher: S. Shamiluulu
 * Student: S.Makhatayeva
 * Group: 1EN03_C
 */
public class Cell implements Serializable{
    private boolean[] walls;
    public Cell(){
        walls = new boolean[4];
        walls[0] = true;
        walls[1] = true;
        walls[2] = true;
        walls[3] = true;
    }
    public void setWall(int wall, boolean t){
        walls[wall] = t;
    }
    public boolean getWall(int wall){
        return walls[wall];
    }
}