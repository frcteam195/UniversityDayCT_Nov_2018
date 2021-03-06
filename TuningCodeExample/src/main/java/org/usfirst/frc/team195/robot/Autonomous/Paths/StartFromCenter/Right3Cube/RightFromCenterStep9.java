package org.usfirst.frc.team195.robot.Autonomous.Paths.StartFromCenter.Right3Cube;

import org.usfirst.frc.team195.robot.Utilities.TrajectoryFollowingMotion.*;
import org.usfirst.frc.team195.robot.Utilities.TrajectoryFollowingMotion.PathBuilder.Waypoint;

import java.util.ArrayList;

public class RightFromCenterStep9 implements PathContainer {

	@Override
	public Path buildPath() {
		ArrayList<Waypoint> sWaypoints = new ArrayList<Waypoint>();
		sWaypoints.add(new Waypoint(49,139,0,0));
		sWaypoints.add(new Waypoint(90,191,45,40));
		sWaypoints.add(new Waypoint(35,196,0,40));

		return PathBuilder.buildPathFromWaypoints(sWaypoints);
	}

	@Override
	public RigidTransform2d getStartPose() {
		return new RigidTransform2d(new Translation2d(49, 139), Rotation2d.fromDegrees(0));
	}

	@Override
	public boolean isReversed() {
		return false;
	}
}