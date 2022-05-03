package algorithms.mazeGenerators;

public interface ImazeGenerator {
    Maze generate(int r,int c);
    long measureAlgorithmTimeMillis(int r,int c);
}
