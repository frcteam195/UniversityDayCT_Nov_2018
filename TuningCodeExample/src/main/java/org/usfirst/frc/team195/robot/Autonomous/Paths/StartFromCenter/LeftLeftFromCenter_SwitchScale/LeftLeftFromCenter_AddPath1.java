package org.usfirst.frc.team195.robot.Autonomous.Paths.StartFromCenter.LeftLeftFromCenter_SwitchScale;

import org.usfirst.frc.team195.robot.Autonomous.Paths.PathAdapter;
import org.usfirst.frc.team195.robot.Utilities.TrajectoryFollowingMotion.*;
import org.usfirst.frc.team195.robot.Utilities.TrajectoryFollowingMotion.PathBuilder.Waypoint;

import java.util.ArrayList;


public class LeftLeftFromCenter_AddPath1 implements PathContainer {

	@Override
	public Path buildPath() {
		ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
		sWaypoints.add(new Waypoint(82,163,0,0));
		sWaypoints.add(new Waypoint(104,252,30,100));
		sWaypoints.add(new Waypoint(194,252,0,70,"PreparePlaceCube"));
		sWaypoints.add(PathAdapter.getAdaptedLeftScaleWaypoint(new Waypoint(288,239,0,60)));

		return PathBuilder.buildPathFromWaypoints(sWaypoints);
	}

	@Override
	public RigidTransform2d getStartPose() {
		return new RigidTransform2d(new Translation2d(82, 163), Rotation2d.fromDegrees(0));
	}

	@Override
	public boolean isReversed() {
		return false;
	}
}