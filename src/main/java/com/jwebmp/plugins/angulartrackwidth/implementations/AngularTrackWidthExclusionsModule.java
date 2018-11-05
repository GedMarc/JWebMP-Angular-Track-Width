package com.jwebmp.plugins.angulartrackwidth.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularTrackWidthExclusionsModule
		implements IGuiceScanModuleExclusions<AngularTrackWidthExclusionsModule>,
				           IGuiceScanJarExclusions<AngularTrackWidthExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-angular-track-width-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angulartrackwidth");
		return strings;
	}
}
