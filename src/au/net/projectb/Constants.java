package au.net.projectb;

import com.ctre.phoenix.motorcontrol.NeutralMode;

/**
 * Contains all the ports and gains for organisation
 */
public class Constants {
	// CAN ID
	public static final int kLeftDriveMaster = 1;
	public static final int kLeftDriveSlaveA = 2;
	public static final int kLeftDriveSlaveB = 3;
	
	public static final int kRightDriveMaster = 4;
	public static final int kRightDriveSlaveA = 5;
	public static final int kRightDriveSlaveB = 6;
	
	public static final int kBobcatMotor = 7;
	public static final int kWristMotor = 8;
	
	public static final int kPdp = 63;
	public static final int kPcm = 11;
	
	// PCM Ports	
	public static final int kIntakeClawReverse = 1;	// Open
	public static final int kIntakeClawForward = 0;	// Closed
	
	// DIO Port
	public static final int kElbowZeroHallEffectDioPort = 0;
	
	// Intake Wrist
	// Encoder is on output shaft. Positive is outwards.
	public static int kWristUpPosition = -200;
	public static int kWristDnPosition = 1100;
	
	public static double kPWrist = 1.2;
	public static double kIWrist = 0.0;
	public static double kDWrist = 0.0;
	
	public static int kWristErrorWindow = 60; // TODO: Check this
	public static int kWristMoveDelay = 10; // Delay from moving the claw to moving the wrist (or vice-versa), in 0.02 seconds (50hz)
	
	public static double kWristMaxUpwardVoltage = 10.0;
	public static double kWristMaxDownwardVoltage = 5.0;
	
	// Lift Elbow
	// Has a 84:18 gear reduction after encoder. Positive is outwards.
	public static int kElbowCountsPerRev = 19115; // Actually 19114.666...
	
	public static int kElbowGroundPosition = 0;
	public static int kElbowSwitchPosition = 2000;
	public static int kElbowScaleLoPosition = 4000;
	public static int kElbowScaleMiPosition = 5000;
	public static int kElbowScaleHiPosition = 6000;
	
	public static double kPElbow = 2.0; // Theoretical value
	public static double kIElbow = 0.0;
	public static double kDElbow = 0.0;
	
	public static int kElbowErrorWindow = 60; // TODO: Check this
	
	public static int kElbowIllegalPosLowerBound = 100;
	public static int kElbowIllegalPosUpperBound = 5000;
	
	public static double kElbowManualDeadzone = 0.1;
	
	public static double kElbowMaxUpwardVoltage = 12.0; // +/- of 0
	public static double kElbowMaxDownwardVoltage = 6.0; // Stops the arm from smashing into the battery
	
	// Drive Settings
	public static double kDriveVoltageRamp = 0.125;
	public static NeutralMode kDriveNeutralMode = NeutralMode.Brake;
	
	public static double kPPointTurn = 0.0;
	
	// System Attributes
	public static int kMagEncoderCountsPerRev = 4096;
}
