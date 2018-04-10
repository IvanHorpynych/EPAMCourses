package ua.homework.taskflowcontrol.flow6;

//1
public class Airplane {
    private boolean launched = false;
    private AirplaneEngine airplaneEngine = createAirplaneEngine();

    public AirplaneEngine getAirplaneEngine() {
        return airplaneEngine;
    }

    public boolean getLaunched() {
        return launched;
    }

    public boolean getStarted() {
        return this.airplaneEngine.started;
    }

    public void start() {
        airplaneEngine.start();
    }

    private class AirplaneEngine implements IEngine {
        private boolean started = false;

        public boolean getStarted() {
            return this.started;
        }

        public void start() {
            Airplane.this.launched = true;
            this.started = true;
            System.out.println("Airplane engine start");
        }

        public class Engine {

            public void start() {
                Airplane.this.launched = true;
            }

        }

    }

    //2
    public AirplaneEngine createAirplaneEngine() {
        return new AirplaneEngine();
    }

    //3
    public IEngine createInnerAirplaneEngine() {
        class InnerAirplaneEngine implements IEngine {
            private boolean started = false;

            public boolean getStarted() {
                return this.started;
            }

            public void start() {
                Airplane.this.launched = true;
                this.started = true;
                System.out.println("Inner Airplane engine start");
            }
        }
        return new InnerAirplaneEngine();
    }

    //4
    public IEngine createAnonimusAirplaeEngine() {
        return () -> System.out.println("Anonymous Airplane engine start");
    }


    public static void main(String[] args) {
        Airplane airplane = new Airplane();

        airplane.getAirplaneEngine().start();

        airplane.createInnerAirplaneEngine().start();

        airplane.createAnonimusAirplaeEngine().start();
    }
}
