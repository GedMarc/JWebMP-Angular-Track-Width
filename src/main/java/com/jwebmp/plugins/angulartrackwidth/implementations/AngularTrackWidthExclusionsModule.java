package com.jwebmp.plugins.angulartrackwidth.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularTrackWidthExclusionsModule
		implements IGuiceScanModuleExclusions<AngularTrackWidthExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angulartrackwidth");
		return strings;
	}
}
