package com.jwebmp.plugins.angulartrackwidth.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AngularTrackWidthInclusionModule implements IGuiceScanModuleInclusions<AngularTrackWidthInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.angulartrackwidth");
		return set;
	}
}
