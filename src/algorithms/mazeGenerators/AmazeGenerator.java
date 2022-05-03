package algorithms.mazeGenerators;

public abstract class AmazeGenerator implements ImazeGenerator{
    @Override
    public long measureAlgorithmTimeMillis(int r,int c){
        long start=System.currentTimeMillis();
        generate(r,c);
        long end=System.currentTimeMillis();
        return end-start;
    }



}
