package shooot.map;

import shooot.game.SoundPlay;
import shooot.map.Background;
import shooot.map.Map;
import shooot.map.entity.Enemy;
import shooot.map.entity.JumpingEnemy;
import shooot.map.entity.PatrolingEnemy;
import shooot.map.entity.Crate;
import shooot.map.entity.UserEntity;

/**
 * @author partha
 */
public class LevelOne extends Map {

    private Enemy enemy;

    public LevelOne(String s) {

        super("");

    }

    @Override
    public void update() {

        super.update();


    }

    @Override
    protected void initialiseNonStatic(String s) {

        super.initialiseNonStatic(s);

        bg = new Background("/pics/back7.png", 1.25);

        UserEntity test = new UserEntity(-70, 263, "", this, true);
        playerEntity = test;

       
        enemy = new PatrolingEnemy(-300, 100, this);
        renderableEntities.add(enemy);
        moveableEntities.add(enemy);
        entities.add(enemy);

        enemy = new PatrolingEnemy(637, 370, this);
        renderableEntities.add(enemy);
        moveableEntities.add(enemy);
        entities.add(enemy);

        enemy = new JumpingEnemy(1162, 160, this);
        renderableEntities.add(enemy);
        moveableEntities.add(enemy);
        entities.add(enemy);

        enemy = new PatrolingEnemy(2218, 190, this);
        renderableEntities.add(enemy);
        moveableEntities.add(enemy);
        entities.add(enemy);

        enemy = new PatrolingEnemy(3623, 469, this);
        renderableEntities.add(enemy);
        moveableEntities.add(enemy);
        entities.add(enemy);

        enemy = new PatrolingEnemy(5737, 269, this);
        renderableEntities.add(enemy);
        moveableEntities.add(enemy);
        entities.add(enemy);

        enemy = new JumpingEnemy(6378, 189, this);
        renderableEntities.add(enemy);
        moveableEntities.add(enemy);
        entities.add(enemy);

        enemy = new JumpingEnemy(8700, 300, this);
        renderableEntities.add(enemy);
        moveableEntities.add(enemy);
        entities.add(enemy);

        renderableEntities.add(test);
        moveableEntities.add(test);
        entities.add(test);

        String filename = "/sound/zabutom.lets.shooting.mp3";
        soundtrack = new SoundPlay(filename);
        if (!mute) {
            soundtrack.play();
        }

    }

    @Override
    protected void initialiseStatic() {

        super.initialiseStatic();
        worldstore.add(new Crate(-400, 440, this));
        worldstore.add(new Crate(-400, 480, this));
        worldstore.add(new Crate(-400, 520, this));
        worldstore.add(new Crate(-400, 560, this));
        worldstore.add(new Crate(-350, 560, this));
        worldstore.add(new Crate(-300, 560, this));
        worldstore.add(new Crate(-250, 560, this));
        worldstore.add(new Crate(-200, 560, this));
        worldstore.add(new Crate(-150, 560, this));
        worldstore.add(new Crate(-100, 560, this));
        worldstore.add(new Crate(-50, 560, this));
        worldstore.add(new Crate(0, 560, this));
        worldstore.add(new Crate(50, 560, this));
        worldstore.add(new Crate(50, 520, this));
        worldstore.add(new Crate(200, 480, this));
        worldstore.add(new Crate(250, 480, this));
        worldstore.add(new Crate(300, 480, this));
        worldstore.add(new Crate(350, 480, this));
        worldstore.add(new Crate(450, 400, this));
        worldstore.add(new Crate(500, 400, this));
        worldstore.add(new Crate(500, 440, this));
        worldstore.add(new Crate(550, 440, this));
        worldstore.add(new Crate(600, 440, this));
        worldstore.add(new Crate(650, 440, this));
        worldstore.add(new Crate(700, 440, this));
        worldstore.add(new Crate(750, 440, this));
        worldstore.add(new Crate(800, 440, this));
        worldstore.add(new Crate(900, 440, this));
        worldstore.add(new Crate(850, 440, this));
        worldstore.add(new Crate(950, 400, this));
        worldstore.add(new Crate(950, 360, this));
        worldstore.add(new Crate(950, 440, this));
        worldstore.add(new Crate(800, 280, this));
        worldstore.add(new Crate(750, 280, this));
        worldstore.add(new Crate(550, 240, this));
        worldstore.add(new Crate(500, 240, this));
        worldstore.add(new Crate(350, 160, this));
        worldstore.add(new Crate(550, 180, this));
        worldstore.add(new Crate(350, 200, this));
        worldstore.add(new Crate(300, 160, this));
        worldstore.add(new Crate(800, 180, this));
        worldstore.add(new Crate(950, 120, this));
        worldstore.add(new Crate(1000, 160, this));
        worldstore.add(new Crate(950, 160, this));
        worldstore.add(new Crate(1000, 200, this));
        worldstore.add(new Crate(1050, 200, this));
        worldstore.add(new Crate(1050, 240, this));
        worldstore.add(new Crate(1100, 240, this));
        worldstore.add(new Crate(1100, 280, this));
        worldstore.add(new Crate(1100, 320, this));
        worldstore.add(new Crate(1100, 360, this));
        worldstore.add(new Crate(1100, 400, this));
        worldstore.add(new Crate(1150, 240, this));
        worldstore.add(new Crate(1200, 240, this));
        worldstore.add(new Crate(1250, 240, this));
        worldstore.add(new Crate(1300, 240, this));
        worldstore.add(new Crate(1350, 240, this));
        worldstore.add(new Crate(1500, 240, this));
        worldstore.add(new Crate(1500, 280, this));
        worldstore.add(new Crate(1500, 320, this));
        worldstore.add(new Crate(1500, 360, this));
        worldstore.add(new Crate(1450, 360, this));
        worldstore.add(new Crate(1400, 360, this));
        worldstore.add(new Crate(1350, 360, this));
        worldstore.add(new Crate(1300, 360, this));
        worldstore.add(new Crate(1200, 480, this));
        worldstore.add(new Crate(1200, 520, this));
        worldstore.add(new Crate(1250, 520, this));
        worldstore.add(new Crate(1350, 520, this));
        worldstore.add(new Crate(1450, 520, this));
        worldstore.add(new Crate(1400, 520, this));
        worldstore.add(new Crate(1550, 520, this));
        worldstore.add(new Crate(1600, 520, this));
        worldstore.add(new Crate(1650, 520, this));
        worldstore.add(new Crate(1700, 520, this));
        worldstore.add(new Crate(1750, 520, this));
        worldstore.add(new Crate(1800, 520, this));
        worldstore.add(new Crate(1800, 480, this));
        worldstore.add(new Crate(1800, 440, this));
        worldstore.add(new Crate(1550, 360, this));
        worldstore.add(new Crate(1750, 480, this));
        worldstore.add(new Crate(1800, 400, this));
        worldstore.add(new Crate(1800, 240, this));
        worldstore.add(new Crate(1500, 200, this));
        worldstore.add(new Crate(1500, 160, this));
        worldstore.add(new Crate(1500, 120, this));
        worldstore.add(new Crate(1500, 80, this));
        worldstore.add(new Crate(1500, 40, this));
        worldstore.add(new Crate(1500, 0, this));
        worldstore.add(new Crate(1550, 120, this));
        worldstore.add(new Crate(1850, 80, this));
        worldstore.add(new Crate(1900, 80, this));
        worldstore.add(new Crate(1950, 80, this));
        worldstore.add(new Crate(1950, 120, this));
        worldstore.add(new Crate(2000, 160, this));
        worldstore.add(new Crate(2000, 120, this));
        worldstore.add(new Crate(2050, 160, this));
        worldstore.add(new Crate(2050, 200, this));
        worldstore.add(new Crate(2050, 280, this));
        worldstore.add(new Crate(2050, 320, this));
        worldstore.add(new Crate(2050, 360, this));
        worldstore.add(new Crate(2100, 280, this));
        worldstore.add(new Crate(2150, 280, this));
        worldstore.add(new Crate(2200, 280, this));
        worldstore.add(new Crate(2250, 280, this));
        worldstore.add(new Crate(2050, 240, this));
        worldstore.add(new Crate(2300, 280, this));
        worldstore.add(new Crate(2350, 280, this));
        worldstore.add(new Crate(2400, 280, this));
        worldstore.add(new Crate(2450, 280, this));
        worldstore.add(new Crate(2450, 320, this));
        worldstore.add(new Crate(2500, 280, this));
        worldstore.add(new Crate(2550, 280, this));
        worldstore.add(new Crate(2550, 240, this));
        worldstore.add(new Crate(2700, 400, this));
        worldstore.add(new Crate(2700, 440, this));
        worldstore.add(new Crate(2700, 480, this));
        worldstore.add(new Crate(2700, 520, this));
        worldstore.add(new Crate(2850, 440, this));
        worldstore.add(new Crate(2850, 480, this));
        worldstore.add(new Crate(2850, 520, this));
        worldstore.add(new Crate(3000, 480, this));
        worldstore.add(new Crate(3000, 520, this));
        worldstore.add(new Crate(3150, 520, this));
        worldstore.add(new Crate(2700, 560, this));
        worldstore.add(new Crate(2850, 560, this));
        worldstore.add(new Crate(3000, 560, this));
        worldstore.add(new Crate(3150, 560, this));
        worldstore.add(new Crate(2700, 0, this));
        worldstore.add(new Crate(2700, 40, this));
        worldstore.add(new Crate(2700, 80, this));
        worldstore.add(new Crate(2850, 0, this));
        worldstore.add(new Crate(2850, 40, this));
        worldstore.add(new Crate(2850, 80, this));
        worldstore.add(new Crate(2850, 120, this));
        worldstore.add(new Crate(3000, 0, this));
        worldstore.add(new Crate(3000, 40, this));
        worldstore.add(new Crate(3000, 80, this));
        worldstore.add(new Crate(3000, 120, this));
        worldstore.add(new Crate(3000, 160, this));
        worldstore.add(new Crate(3150, 0, this));
        worldstore.add(new Crate(3150, 40, this));
        worldstore.add(new Crate(3150, 80, this));
        worldstore.add(new Crate(3150, 120, this));
        worldstore.add(new Crate(3150, 160, this));
        worldstore.add(new Crate(3150, 200, this));
        worldstore.add(new Crate(3550, 560, this));
        worldstore.add(new Crate(3600, 560, this));
        worldstore.add(new Crate(3700, 560, this));
        worldstore.add(new Crate(3650, 560, this));
        worldstore.add(new Crate(3750, 560, this));
        worldstore.add(new Crate(3800, 560, this));
        worldstore.add(new Crate(3850, 560, this));
        worldstore.add(new Crate(3900, 560, this));
        worldstore.add(new Crate(3900, 520, this));
        worldstore.add(new Crate(3950, 520, this));
        worldstore.add(new Crate(3950, 480, this));
        worldstore.add(new Crate(4000, 480, this));
        worldstore.add(new Crate(4000, 440, this));
        worldstore.add(new Crate(4050, 440, this));
        worldstore.add(new Crate(4300, 560, this));
        worldstore.add(new Crate(4050, 400, this));
        worldstore.add(new Crate(4100, 400, this));
        worldstore.add(new Crate(4350, 560, this));
        worldstore.add(new Crate(4400, 560, this));
        worldstore.add(new Crate(4450, 560, this));
        worldstore.add(new Crate(4300, 360, this));
        worldstore.add(new Crate(4300, 320, this));
        worldstore.add(new Crate(4300, 280, this));
        worldstore.add(new Crate(4300, 240, this));
        worldstore.add(new Crate(4300, 200, this));
        worldstore.add(new Crate(4300, 160, this));
        worldstore.add(new Crate(3850, 320, this));
        worldstore.add(new Crate(3900, 320, this));
        worldstore.add(new Crate(3800, 280, this));
        worldstore.add(new Crate(3850, 280, this));
        worldstore.add(new Crate(3750, 240, this));
        worldstore.add(new Crate(3800, 240, this));
        worldstore.add(new Crate(3950, 120, this));
        worldstore.add(new Crate(4000, 120, this));
        worldstore.add(new Crate(4050, 120, this));
        worldstore.add(new Crate(4300, 120, this));
        worldstore.add(new Crate(4300, 80, this));
        worldstore.add(new Crate(4300, 40, this));
        worldstore.add(new Crate(4300, 0, this));
        worldstore.add(new Crate(4100, 360, this));
        worldstore.add(new Crate(3500, 560, this));
        worldstore.add(new Crate(3450, 560, this));
        worldstore.add(new Crate(3450, 520, this));
        worldstore.add(new Crate(4450, 520, this));
        worldstore.add(new Crate(4600, 440, this));
        worldstore.add(new Crate(4750, 400, this));
        worldstore.add(new Crate(4900, 520, this));
        worldstore.add(new Crate(5050, 440, this));
        worldstore.add(new Crate(5300, 360, this));
        worldstore.add(new Crate(5050, 240, this));
        worldstore.add(new Crate(4600, 240, this));
        worldstore.add(new Crate(4350, 200, this));
        worldstore.add(new Crate(4400, 200, this));
        worldstore.add(new Crate(4450, 200, this));
        worldstore.add(new Crate(4350, 160, this));
        worldstore.add(new Crate(4350, 120, this));
        worldstore.add(new Crate(4400, 160, this));
        worldstore.add(new Crate(4550, 40, this));
        worldstore.add(new Crate(4600, 40, this));
        worldstore.add(new Crate(4650, 40, this));
        worldstore.add(new Crate(5050, 40, this));
        worldstore.add(new Crate(5100, 40, this));
        worldstore.add(new Crate(5150, 40, this));
        worldstore.add(new Crate(5200, 40, this));
        worldstore.add(new Crate(5250, 40, this));
        worldstore.add(new Crate(5250, 80, this));
        worldstore.add(new Crate(5300, 80, this));
        worldstore.add(new Crate(5350, 80, this));
        worldstore.add(new Crate(5350, 120, this));
        worldstore.add(new Crate(5400, 120, this));
        worldstore.add(new Crate(5450, 120, this));
        worldstore.add(new Crate(5450, 160, this));
        worldstore.add(new Crate(5500, 160, this));
        worldstore.add(new Crate(5550, 160, this));
        worldstore.add(new Crate(4850, 240, this));
        worldstore.add(new Crate(4500, 40, this));
        worldstore.add(new Crate(5000, 40, this));
        worldstore.add(new Crate(5550, 200, this));
        worldstore.add(new Crate(5550, 240, this));
        worldstore.add(new Crate(5550, 280, this));
        worldstore.add(new Crate(5550, 320, this));
        worldstore.add(new Crate(5550, 360, this));
        worldstore.add(new Crate(5550, 440, this));
        worldstore.add(new Crate(5550, 400, this));
        worldstore.add(new Crate(5550, 520, this));
        worldstore.add(new Crate(5550, 480, this));
        worldstore.add(new Crate(5550, 560, this));
        worldstore.add(new Crate(5600, 560, this));
        worldstore.add(new Crate(5650, 560, this));
        worldstore.add(new Crate(5700, 560, this));
        worldstore.add(new Crate(5800, 560, this));
        worldstore.add(new Crate(5750, 560, this));
        worldstore.add(new Crate(5850, 560, this));
        worldstore.add(new Crate(5900, 560, this));
        worldstore.add(new Crate(5950, 560, this));
        worldstore.add(new Crate(4300, 400, this));
        worldstore.add(new Crate(5600, 160, this));
        worldstore.add(new Crate(5650, 160, this));
        worldstore.add(new Crate(5750, 160, this));
        worldstore.add(new Crate(5700, 160, this));
        worldstore.add(new Crate(5800, 360, this));
        worldstore.add(new Crate(5650, 280, this));
        worldstore.add(new Crate(5650, 320, this));
        worldstore.add(new Crate(5650, 360, this));
        worldstore.add(new Crate(5700, 360, this));
        worldstore.add(new Crate(5750, 360, this));
        worldstore.add(new Crate(5850, 360, this));
        worldstore.add(new Crate(5900, 360, this));
        worldstore.add(new Crate(5900, 320, this));
        worldstore.add(new Crate(5900, 400, this));
        worldstore.add(new Crate(5950, 400, this));
        worldstore.add(new Crate(6000, 400, this));
        worldstore.add(new Crate(6000, 360, this));
        worldstore.add(new Crate(6000, 280, this));
        worldstore.add(new Crate(6000, 320, this));
        worldstore.add(new Crate(6000, 240, this));
        worldstore.add(new Crate(6000, 200, this));
        worldstore.add(new Crate(6000, 160, this));
        worldstore.add(new Crate(6000, 120, this));
        worldstore.add(new Crate(6000, 80, this));
        worldstore.add(new Crate(6000, 40, this));
        worldstore.add(new Crate(5800, 160, this));
        worldstore.add(new Crate(5850, 160, this));
        worldstore.add(new Crate(6000, 0, this));
        worldstore.add(new Crate(5600, 480, this));
        worldstore.add(new Crate(5600, 520, this));
        worldstore.add(new Crate(5650, 520, this));
        worldstore.add(new Crate(5700, 480, this));
        worldstore.add(new Crate(5700, 520, this));
        worldstore.add(new Crate(5750, 520, this));
        worldstore.add(new Crate(6000, 560, this));
        worldstore.add(new Crate(6050, 560, this));
        worldstore.add(new Crate(6100, 560, this));
        worldstore.add(new Crate(6250, 520, this));
        worldstore.add(new Crate(6500, 480, this));
        worldstore.add(new Crate(6700, 400, this));
        worldstore.add(new Crate(6200, 240, this));
        worldstore.add(new Crate(6100, 120, this));
        worldstore.add(new Crate(6150, 120, this));
        worldstore.add(new Crate(6050, 120, this));
        worldstore.add(new Crate(6400, 280, this));
        worldstore.add(new Crate(6750, 280, this));
        worldstore.add(new Crate(6400, 40, this));
        worldstore.add(new Crate(6450, 40, this));
        worldstore.add(new Crate(6500, 40, this));
        worldstore.add(new Crate(6700, 80, this));
        worldstore.add(new Crate(6750, 80, this));
        worldstore.add(new Crate(6800, 80, this));
        worldstore.add(new Crate(6850, 80, this));
        worldstore.add(new Crate(6850, 120, this));
        worldstore.add(new Crate(6850, 160, this));
        worldstore.add(new Crate(6900, 160, this));
        worldstore.add(new Crate(6900, 120, this));
        worldstore.add(new Crate(6950, 160, this));
        worldstore.add(new Crate(7100, 160, this));
        worldstore.add(new Crate(7150, 160, this));
        worldstore.add(new Crate(7150, 200, this));
        worldstore.add(new Crate(7150, 240, this));
        worldstore.add(new Crate(7150, 320, this));
        worldstore.add(new Crate(7150, 360, this));
        worldstore.add(new Crate(7400, 280, this));
        worldstore.add(new Crate(7400, 240, this));
        worldstore.add(new Crate(7400, 200, this));
        worldstore.add(new Crate(7400, 160, this));
        worldstore.add(new Crate(7400, 120, this));
        worldstore.add(new Crate(7400, 80, this));
        worldstore.add(new Crate(7150, 280, this));
        worldstore.add(new Crate(7400, 320, this));
        worldstore.add(new Crate(7400, 360, this));
        worldstore.add(new Crate(7400, 400, this));
        worldstore.add(new Crate(7400, 440, this));
        worldstore.add(new Crate(7150, 440, this));
        worldstore.add(new Crate(7150, 400, this));
        worldstore.add(new Crate(7150, 480, this));
        worldstore.add(new Crate(7150, 520, this));
        worldstore.add(new Crate(7150, 560, this));
        worldstore.add(new Crate(7200, 560, this));
        worldstore.add(new Crate(7250, 560, this));
        worldstore.add(new Crate(7150, 120, this));
        worldstore.add(new Crate(7350, 200, this));
        worldstore.add(new Crate(7300, 200, this));
        worldstore.add(new Crate(7200, 320, this));
        worldstore.add(new Crate(7250, 320, this));
        worldstore.add(new Crate(7350, 440, this));
        worldstore.add(new Crate(7300, 440, this));
        worldstore.add(new Crate(7300, 560, this));
        worldstore.add(new Crate(7350, 560, this));
        worldstore.add(new Crate(7400, 560, this));
        worldstore.add(new Crate(7550, 240, this));
        worldstore.add(new Crate(7550, 280, this));
        worldstore.add(new Crate(7550, 320, this));
        worldstore.add(new Crate(7550, 360, this));
        worldstore.add(new Crate(7550, 400, this));
        worldstore.add(new Crate(7600, 240, this));
        worldstore.add(new Crate(7650, 240, this));
        worldstore.add(new Crate(7700, 240, this));
        worldstore.add(new Crate(7600, 320, this));
        worldstore.add(new Crate(7600, 400, this));
        worldstore.add(new Crate(7650, 400, this));
        worldstore.add(new Crate(7700, 400, this));
        worldstore.add(new Crate(7800, 240, this));
        worldstore.add(new Crate(7800, 280, this));
        worldstore.add(new Crate(7800, 320, this));
        worldstore.add(new Crate(7800, 360, this));
        worldstore.add(new Crate(7800, 400, this));
        worldstore.add(new Crate(7850, 240, this));
        worldstore.add(new Crate(7900, 240, this));
        worldstore.add(new Crate(7950, 240, this));
        worldstore.add(new Crate(7950, 280, this));
        worldstore.add(new Crate(7950, 320, this));
        worldstore.add(new Crate(7900, 320, this));
        worldstore.add(new Crate(7850, 320, this));
        worldstore.add(new Crate(8150, 240, this));
        worldstore.add(new Crate(8050, 240, this));
        worldstore.add(new Crate(8100, 240, this));
        worldstore.add(new Crate(8050, 280, this));
        worldstore.add(new Crate(8050, 320, this));
        worldstore.add(new Crate(8100, 320, this));
        worldstore.add(new Crate(8150, 320, this));
        worldstore.add(new Crate(8200, 320, this));
        worldstore.add(new Crate(8200, 360, this));
        worldstore.add(new Crate(8200, 400, this));
        worldstore.add(new Crate(8100, 400, this));
        worldstore.add(new Crate(8050, 400, this));
        worldstore.add(new Crate(8150, 400, this));
        worldstore.add(new Crate(8200, 240, this));
        worldstore.add(new Crate(8300, 240, this));
        worldstore.add(new Crate(8300, 280, this));
        worldstore.add(new Crate(8300, 320, this));
        worldstore.add(new Crate(8300, 360, this));
        worldstore.add(new Crate(8300, 400, this));
        worldstore.add(new Crate(8400, 240, this));
        worldstore.add(new Crate(8400, 320, this));
        worldstore.add(new Crate(8400, 280, this));
        worldstore.add(new Crate(8400, 360, this));
        worldstore.add(new Crate(8400, 400, this));
        worldstore.add(new Crate(8450, 400, this));
        worldstore.add(new Crate(8500, 400, this));
        worldstore.add(new Crate(8550, 400, this));
        worldstore.add(new Crate(8650, 240, this));
        worldstore.add(new Crate(8650, 280, this));
        worldstore.add(new Crate(8650, 320, this));
        worldstore.add(new Crate(8650, 360, this));
        worldstore.add(new Crate(8650, 400, this));
        worldstore.add(new Crate(8700, 400, this));
        worldstore.add(new Crate(8750, 400, this));
        worldstore.add(new Crate(8800, 400, this));
        worldstore.add(new Crate(8800, 360, this));
        worldstore.add(new Crate(8800, 320, this));
        worldstore.add(new Crate(8800, 240, this));
        worldstore.add(new Crate(8800, 280, this));
        worldstore.add(new Crate(8750, 240, this));
        worldstore.add(new Crate(8700, 240, this));
        worldstore.add(new Crate(7500, 560, this));
        worldstore.add(new Crate(7450, 560, this));
        worldstore.add(new Crate(7550, 560, this));
        worldstore.add(new Crate(7600, 560, this));
        worldstore.add(new Crate(7600, 520, this));
        worldstore.add(new Crate(7650, 520, this));
        worldstore.add(new Crate(7750, 520, this));
        worldstore.add(new Crate(7700, 520, this));
        worldstore.add(new Crate(7800, 520, this));
        worldstore.add(new Crate(7850, 520, this));
        worldstore.add(new Crate(7900, 520, this));
        worldstore.add(new Crate(8000, 520, this));
        worldstore.add(new Crate(7950, 520, this));
        worldstore.add(new Crate(8050, 520, this));
        worldstore.add(new Crate(8100, 520, this));
        worldstore.add(new Crate(8150, 520, this));
        worldstore.add(new Crate(8250, 520, this));
        worldstore.add(new Crate(8200, 520, this));
        worldstore.add(new Crate(8300, 520, this));
        worldstore.add(new Crate(8350, 520, this));
        worldstore.add(new Crate(8400, 520, this));
        worldstore.add(new Crate(8450, 520, this));
        worldstore.add(new Crate(8500, 520, this));
        worldstore.add(new Crate(8550, 520, this));
        worldstore.add(new Crate(8600, 520, this));
        worldstore.add(new Crate(8650, 520, this));
        worldstore.add(new Crate(8700, 520, this));
        worldstore.add(new Crate(8750, 520, this));
        worldstore.add(new Crate(8800, 520, this));
        worldstore.add(new Crate(8850, 520, this));
        worldstore.add(new Crate(8900, 520, this));
        worldstore.add(new Crate(8950, 520, this));
        worldstore.add(new Crate(9000, 520, this));
        worldstore.add(new Crate(9350, 120, this));
        worldstore.add(new Crate(9350, 160, this));
        worldstore.add(new Crate(9350, 200, this));
        worldstore.add(new Crate(9350, 80, this));
        worldstore.add(new Crate(9350, 40, this));
        worldstore.add(new Crate(9400, 80, this));
        worldstore.add(new Crate(9450, 120, this));
        worldstore.add(new Crate(9500, 80, this));
        worldstore.add(new Crate(9550, 40, this));
        worldstore.add(new Crate(9550, 120, this));
        worldstore.add(new Crate(9550, 80, this));
        worldstore.add(new Crate(9550, 160, this));
        worldstore.add(new Crate(9550, 200, this));
        worldstore.add(new Crate(9650, 40, this));
        worldstore.add(new Crate(9650, 80, this));
        worldstore.add(new Crate(9650, 120, this));
        worldstore.add(new Crate(9650, 160, this));
        worldstore.add(new Crate(9650, 200, this));
        worldstore.add(new Crate(9700, 80, this));
        worldstore.add(new Crate(9750, 120, this));
        worldstore.add(new Crate(9800, 80, this));
        worldstore.add(new Crate(9850, 40, this));
        worldstore.add(new Crate(9850, 80, this));
        worldstore.add(new Crate(9850, 120, this));
        worldstore.add(new Crate(9850, 160, this));
        worldstore.add(new Crate(9850, 200, this));
        worldstore.add(new Crate(10100, 40, this));
        worldstore.add(new Crate(10100, 80, this));
        worldstore.add(new Crate(10100, 120, this));
        worldstore.add(new Crate(10100, 200, this));
        worldstore.add(new Crate(10100, 160, this));
        worldstore.add(new Crate(10150, 80, this));
        worldstore.add(new Crate(10200, 120, this));
        worldstore.add(new Crate(10250, 80, this));
        worldstore.add(new Crate(10300, 40, this));
        worldstore.add(new Crate(10300, 80, this));
        worldstore.add(new Crate(10300, 160, this));
        worldstore.add(new Crate(10300, 120, this));
        worldstore.add(new Crate(10300, 200, this));
        worldstore.add(new Crate(10400, 40, this));
        worldstore.add(new Crate(10400, 80, this));
        worldstore.add(new Crate(10400, 120, this));
        worldstore.add(new Crate(10400, 160, this));
        worldstore.add(new Crate(10400, 200, this));
        worldstore.add(new Crate(10450, 40, this));
        worldstore.add(new Crate(10500, 40, this));
        worldstore.add(new Crate(10550, 80, this));
        worldstore.add(new Crate(10550, 120, this));
        worldstore.add(new Crate(10550, 160, this));
        worldstore.add(new Crate(10500, 200, this));
        worldstore.add(new Crate(10450, 200, this));
        worldstore.add(new Crate(9000, 480, this));
        worldstore.add(new Crate(9050, 480, this));
        worldstore.add(new Crate(9100, 440, this));
        worldstore.add(new Crate(9050, 440, this));
        worldstore.add(new Crate(9150, 400, this));
        worldstore.add(new Crate(9100, 400, this));
        worldstore.add(new Crate(9150, 360, this));
        worldstore.add(new Crate(9200, 360, this));
        worldstore.add(new Crate(9250, 320, this));
        worldstore.add(new Crate(9200, 320, this));
        worldstore.add(new Crate(9350, 320, this));
        worldstore.add(new Crate(9300, 320, this));
        worldstore.add(new Crate(9400, 320, this));
        worldstore.add(new Crate(9450, 320, this));
        worldstore.add(new Crate(9500, 320, this));
        worldstore.add(new Crate(9550, 320, this));
        worldstore.add(new Crate(9600, 320, this));
        worldstore.add(new Crate(9700, 320, this));
        worldstore.add(new Crate(9650, 320, this));
        worldstore.add(new Crate(9800, 320, this));
        worldstore.add(new Crate(9750, 320, this));
        worldstore.add(new Crate(9850, 320, this));
        worldstore.add(new Crate(10000, 320, this));
        worldstore.add(new Crate(9900, 320, this));
        worldstore.add(new Crate(10100, 320, this));
        worldstore.add(new Crate(10150, 320, this));
        worldstore.add(new Crate(10050, 320, this));
        worldstore.add(new Crate(9950, 320, this));
        worldstore.add(new Crate(10200, 320, this));
        worldstore.add(new Crate(10250, 320, this));
        worldstore.add(new Crate(10300, 320, this));
        worldstore.add(new Crate(10400, 320, this));
        worldstore.add(new Crate(10450, 320, this));
        worldstore.add(new Crate(10350, 320, this));
        worldstore.add(new Crate(10500, 320, this));
        worldstore.add(new Crate(10550, 320, this));
        worldstore.add(new Crate(10600, 320, this));
        worldstore.add(new Crate(10650, 320, this));
        worldstore.add(new Crate(10700, 320, this));
        worldstore.add(new Crate(10700, 280, this));
        worldstore.add(new Crate(10700, 240, this));
        worldstore.add(new Crate(10700, 200, this));
        worldstore.add(new Crate(10700, 160, this));
        worldstore.add(new Crate(10700, 120, this));
        worldstore.add(new Crate(10700, 80, this));
        worldstore.add(new Crate(10700, 40, this));
        worldstore.add(new Crate(10700, 0, this));
        worldstore.add(new Crate(9700, 400, this));
        worldstore.add(new Crate(9700, 440, this));
        worldstore.add(new Crate(9750, 480, this));
        worldstore.add(new Crate(9750, 520, this));
        worldstore.add(new Crate(9800, 560, this));
        worldstore.add(new Crate(9850, 520, this));
        worldstore.add(new Crate(9850, 480, this));
        worldstore.add(new Crate(9900, 440, this));
        worldstore.add(new Crate(9900, 400, this));
        worldstore.add(new Crate(10000, 400, this));
        worldstore.add(new Crate(10050, 400, this));
        worldstore.add(new Crate(10100, 400, this));
        worldstore.add(new Crate(10100, 440, this));
        worldstore.add(new Crate(10050, 480, this));
        worldstore.add(new Crate(10000, 520, this));
        worldstore.add(new Crate(10000, 560, this));
        worldstore.add(new Crate(10050, 560, this));
        worldstore.add(new Crate(10150, 560, this));
        worldstore.add(new Crate(10100, 560, this));
        worldstore.add(new Crate(10200, 560, this));
        worldstore.add(new Crate(7400, 40, this));
        worldstore.add(new Crate(7400, 0, this));

    }
}