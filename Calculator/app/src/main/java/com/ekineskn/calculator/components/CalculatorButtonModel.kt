package com.ekineskn.calculator.components

import androidx.compose.ui.graphics.vector.ImageVector

data class CalculatorButtonModel(
     val text: String? = null,
     val type: CalculatorButtonType,
     val icon: ImageVector? = null,
)



