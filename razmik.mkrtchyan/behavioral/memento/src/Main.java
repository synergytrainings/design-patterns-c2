public class Main {

    public static void main(String[] args) {
       MasterGameObject masterGameObject=new MasterGameObject();
        masterGameObject.setGameState(1);
        GameObjectCareTaker  gameObjectCareTaker=new GameObjectCareTaker();
        gameObjectCareTaker.save(masterGameObject);
        masterGameObject.setGameState(2);
        gameObjectCareTaker.save(masterGameObject);
        gameObjectCareTaker.load(masterGameObject);
        masterGameObject.setGameState(3);
        gameObjectCareTaker.load(masterGameObject);


    }
}
