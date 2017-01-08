/**
 * Created by Man on 08.01.2017.
 */
public class UnitsAndRatesGaussQuadrature {
    private final double [][] A={
            {1,1},
            {0.55555555555555555556,0.88888888888888888889,0.55555555555555555556},
            {0.34785484513745385737,0.65214515486254614263,0.65214515486254614263,0.34785484513745385737},
            {0.23692688505618908751,0.47862867049936646804,0.56888888888888888889,0.47862867049936646804,0.23692688505618908751},
            {0.17132449237917034504,0.36076157304813860757,0.46791393457269104739,0.46791393457269104739,0.36076157304813860757,0.17132449237917034504},
            {0.12948496616886969327,0.27970539148927666790,0.38183005050511894495,0.41795918367346938776,0.38183005050511894495,0.27970539148927666790,0.12948496616886969327}
    };
    private final double [][] t={
            {-0.57735026918962576451,0.57735026918962576451},
            {-0.77459666924148337704,0,0.77459666924148337704},
            {-0.86113631159405257522,-0.33998104358485626480,0.33998104358485626480,0.86113631159405257522},
            {-0.90617984593866399280,-0.53846931010568309104,0,0.53846931010568309104,0.90617984593866399280},
            {-0.93246951420315202781,-0.66120938646626451366,-0.23861918608319690863,0.23861918608319690863,0.66120938646626451366,0.93246951420315202781},
            {-0.94910791234275852453,-0.74153118559939443986,-0.40584515137739716691,0,0.40584515137739716691,0.74153118559939443986,0.94910791234275852453}
    };


    public double getA(int i,int j) {
        return A[i][j];
    }
    public double getT(int i,int j) {
        return t[i][j];
    }
}
