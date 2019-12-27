/*
 * DexPatcher - Copyright 2015-2019 Rodrigo Balerdi
 * (GNU General Public License version 3 or later)
 *
 * DexPatcher is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 */

package lanchon.dexpatcher;

import lanchon.dexpatcher.Processor.PreTransform;
import lanchon.dexpatcher.core.Context;
import lanchon.dexpatcher.core.logger.Logger;
import lanchon.dexpatcher.transform.codec.StringCodec;
import lanchon.multidexlib2.DexIO;

public class Configuration {

	public String sourceFile;
	public Iterable<String> patchFiles;
	public String patchedFile;

	public int apiLevel;

	public boolean multiDex;
	public int multiDexJobs = 1;

	public int maxDexPoolSize = DexIO.DEFAULT_MAX_DEX_POOL_SIZE;

	public String annotationPackage = Context.DEFAULT_ANNOTATION_PACKAGE;
	public boolean constructorAutoIgnoreDisabled;

	public Logger.Level logLevel = Context.DEFAULT_LOG_LEVEL;

	public String sourceCodeRoot;
	public boolean timingStats;

	public boolean dryRun;

	// Code transform options:

	public boolean mapSource;
	public String deanonSourcePlan;
	public boolean decodeSource;
	public String reanonSourcePlan;
	public boolean unmapSource;

	public String deanonPatchesPlan;
	public boolean decodePatches;
	public String reanonPatchesPlan;
	public boolean unmapPatches;

	public boolean decodeOutput;
	public String reanonOutputPlan;
	public boolean unmapOutput;

	public String mapFile;
	public boolean invertMap;

	public boolean treatAnonymizerErrorsAsWarnings;

	public String codeMarker = StringCodec.DEFAULT_CODE_MARKER;
	public boolean treatDecoderErrorsAsWarnings;

	public PreTransform preTransform = Processor.DEFAULT_PRE_TRANSFORM;

}
