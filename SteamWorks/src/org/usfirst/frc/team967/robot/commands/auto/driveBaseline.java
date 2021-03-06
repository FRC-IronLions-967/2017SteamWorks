package org.usfirst.frc.team967.robot.commands.auto;

import org.usfirst.frc.team967.robot.RobotConstraints;
import org.usfirst.frc.team967.robot.commands.Auto_Drive_Distance;
import org.usfirst.frc.team967.robot.commands.Auto_Straight_Drive;
import org.usfirst.frc.team967.robot.commands.TeleOp_DriveShiftHigh;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class driveBaseline extends CommandGroup {

    public driveBaseline() {
    	addSequential(new TeleOp_DriveShiftHigh(false));
    	addSequential(new Auto_Straight_Drive(-6000, RobotConstraints.Auto_Speed_Fast));
//    	addSequential(new Auto_Drive_Distance(-6000, .75));
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
