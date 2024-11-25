package OrientacaoAObjetos;

abstract class Automovel {
    private int numRodas;
    private int velMax;
    private boolean ligado;

    public Automovel(int numRodas, int velMax) {
        this.numRodas = numRodas;
        this.velMax = velMax;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
        System.out.println("O automóvel foi ligado.");
    }

    public void desigar() {
        this.ligado = false;
        System.out.println("O automóvel foi desligado.");
    }

    public int getNumRodas() {
        return numRodas;
    }

    public int getVelMax() {
        return velMax;
    }

    public boolean isLigado() {
        return ligado;
    }

}

class Carro extends Automovel {
    public Carro(int velMax) {
        super(4, velMax);
    }
}

class CarroAutomatico extends Carro {
    private boolean freioPressionado;

    public CarroAutomatico(int velMax) {
        super(velMax);
        this.freioPressionado = false;
    }

    public void pressionarFreio(boolean pressionado) {
        this.freioPressionado = pressionado;
        System.out.println(pressionado ? "Freio pressionado." : "Freio solto.");
    }

    @Override
    public void ligar() {
        if (freioPressionado) {
            super.ligar();
        } else {
            System.out.println("Pressione o freio para ligar o carro.");
        }
    }
}

class Moto extends Automovel {
    public Moto(int velMax) {
        super(2, velMax);
    }
}

class MotoPartidaPedal extends Moto {
    private boolean aceleradorPuxado;

    public MotoPartidaPedal(int velMax) {
        super(velMax);
        this.aceleradorPuxado = false;
    }

    public void puxarAcelerador(boolean puxado) {
        this.aceleradorPuxado = puxado;
        System.out.println(puxado ? "Acelerador puxado." : "Acelerador solto.");
    }

    @Override
    public void ligar() {
        if (aceleradorPuxado) {
            super.ligar();
        } else {
            System.out.println("Puxe o acelerador para ligar a moto.");
        }
    }
}

class Guincho extends Automovel {
    public Guincho(int velMax) {
        super(4, velMax); // Um guincho também tem 4 rodas
    }

    public void carregar(Automovel automovel) {
        System.out.println("Carregando " + automovel.getClass().getSimpleName() + ".");
    }
}

class Automoveis {
    public static void main(String[] args) {

        CarroAutomatico carroAutomatico = new CarroAutomatico(180);
        MotoPartidaPedal motoPartidaPedal = new MotoPartidaPedal(120);
        Guincho guincho = new Guincho(80);

        carroAutomatico.ligar();
        carroAutomatico.pressionarFreio(true);
        carroAutomatico.ligar();

        motoPartidaPedal.ligar();
        motoPartidaPedal.puxarAcelerador(true);
        motoPartidaPedal.ligar();

        guincho.carregar(carroAutomatico);
        guincho.carregar(motoPartidaPedal);
    }

}