package ZZZZexerciciosteste.domain;

import java.util.Arrays;

/**
 * @author mariana
 * @Project: javacore
 */
public class Ranking {
    private int posicao;
    private Time[] time;

    public Ranking(int posicao, Time[] time) {
        this.posicao = posicao;
       if(time != null){
           this.time = time;
       }
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Time[] getTime() {
        return time;
    }

    public void setTime(Time[] time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Ranking{" +
                "posicao=" + posicao +
                ", time=" + Arrays.toString(time) +
                '}';
    }
}
