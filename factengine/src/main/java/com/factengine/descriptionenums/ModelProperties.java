package com.factengine.descriptionenums;

/**
 * The model properties contain all possible tags that can be used to describe a model.
 * This enumeration is used by classes that extend FactModel.
 * 
 * 
 * @author stelios
 *
 */
public enum ModelProperties {
LINEAR, HANDLES_NON_lINEAR_INTERACTIONS, 

HANDLES_MISSING_VALUES, HANDLES_MIXED_DATA, HANDLES_ORDINAL_DATA,

GOOD_MIXED_DATA, POOR_MIXED_DATA,

NUMERICAL_DATA_ONLY, CATEGORICAL_DATA_ONLY, 

GOOD_MISSING_VALUES, POOR_MISSING_VALUES,

INSENSITIVE_TO_NOISY_FEATURES, SENSITIVE_TO_NOISY_FEATURES, 
INSENSITIVE_TO_OUTLIERS, SENSITIVE_TO_OUTLIERS, 
INSENSITIVE_TO_MONOTONIC_TRANSFORM, SENSITIVE_TO_MONOTONIC_TRANSFORM,
ROTATIONALLY_INVARIANT,

GOOD_SCALABILITY, GOOD_TESTING_SPEED, GOOD_TRAINING_SPEED,
POOR_SCALABILITY, POOR_TESTING_SPEED, POOR_TRAINING_SPEED,

HIGH_BIAS, HIGH_VARIANCE,

GOOD_INTERPRETABILITY, POOR_INTERPRETABILITY, SPARSE_SOLUTION, PROBABILISTIC_OUTPUT,

KERNEL_METHOD,SURVIVAL_ANALYSIS_METHOD,TIME_SERIES_METHOD, GOOD_TIME_SERIES,

GOOD_HIGH_DIMENSIONAL_DATA,

EXTRACTS_LINEAR_COMBINATIONS,

ONLY_FOR_POSITIVE_INTEGERS,

RETURNS_COEFFICIENTS,

//the model can be used as a benchmark. Relevant for linear regression, naive Bayes, etc.
BENCHMARK

}
