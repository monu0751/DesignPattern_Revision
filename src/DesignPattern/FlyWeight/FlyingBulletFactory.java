package DesignPattern.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyingBulletFactory {
    Map<String,ExtrensicFlyingBullet> extrensicFlyingBulletMap = new HashMap<>();

    public ExtrensicFlyingBullet getBullet(String BulletType){
        return extrensicFlyingBulletMap.get(BulletType);
    }

    public void addBullet(String BulletType, ExtrensicFlyingBullet extrensicFlyingBullet){
        extrensicFlyingBulletMap.put(BulletType,extrensicFlyingBullet);
    }
}
