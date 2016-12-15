package rawrdotrar;

import battlecode.common.*;

import java.util.Random;

public class RobotPlayer {

	/**
	 * run() is the method that is called when a robot is instantiated in the
	 * Battlecode world. If this method returns, the robot dies!
	 **/
	@SuppressWarnings("unused")
	public static void run(RobotController rc) {
		// You can instantiate variables here.
		Random rand = new Random(rc.getID());
		int myAttackRange = 0;
		Team myTeam = rc.getTeam();
		Team enemyTeam = myTeam.opponent();

		if (rc.getType() == RobotType.ARCHON) {
			
		} else

		if (rc.getType() == RobotType.SCOUT) {

		} else

		if (rc.getType() == RobotType.GUARD) {

		} else

		if (rc.getType() == RobotType.SOLDIER) {

		} else

		if (rc.getType() == RobotType.VIPER) {

		} else

		if (rc.getType() == RobotType.TTM) {

		} else

		if (rc.getType() == RobotType.TURRET) {

		}
	}
}
