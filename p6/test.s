	.data
	.align 2
_a:	.space 4	# Global Variable Declaratioin
	.data
	.align 2
_b:	.space 4	# Global Variable Declaratioin
	.text
_f1:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 4
			# WRITE
	.data
.L0:	.asciiz "Reach f1\n"	# String Declaration
	.text
	la    $t0, .L0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
_f1_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_f2:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 4
			# WRITE
	.data
.L1:	.asciiz "Reach f2\n"	# String Declaration
	.text
	la    $t0, .L1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
_f2_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_f3:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 4
			# ASSIGN
	la    $t0, -8($fp)	# Load local var addr: c
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Enter PlusNode
			# Enter ArithmeticNode
			# Enter BinaryExpNode
	lw    $t0, 4($fp)	# Load local var: a
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 8($fp)	# Load local var: b
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	add   $t0, $t0, $t1		# Add two expressions
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, -8($fp)	# Load local var: c
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $v0, 4($sp)	# POP
	addu  $sp, $sp, 4
	j     _f3_Exit		# Return: jump to functioin epilogue
			# ASSIGN
	la    $t0, -8($fp)	# Load local var addr: c
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 10
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
_f3_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_f4:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 0
			# Push int on stack
	li    $t0, 4
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 3
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: f3
	jal   _f3
			# After Call function: f3
	addu  $sp, $sp, 8
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $v0, 4($sp)	# POP
	addu  $sp, $sp, 4
	j     _f4_Exit		# Return: jump to functioin epilogue
_f4_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_f5:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 0
	lw    $t0, 8($fp)	# Load local var: b
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $v0, 4($sp)	# POP
	addu  $sp, $sp, 4
	j     _f5_Exit		# Return: jump to functioin epilogue
_f5_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_recursion:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 0
			# Enter IfElse Stmt
			# Enter EqualsNode
			# Enter EqualityExpNode
			# Enter BinaryExpNode
	lw    $t0, 4($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	seq   $t0, $t0, $t1		# Set t0 to 1 if lhs == rhs, otherwise 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 1
	bne   $t0, $t1, .L2		# IfElseStmt: compare with true
			# Push int on stack
	li    $t0, 1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $v0, 4($sp)	# POP
	addu  $sp, $sp, 4
	j     _recursion_Exit		# Return: jump to functioin epilogue
	b     .L3
.L2:
			# Enter PlusNode
			# Enter ArithmeticNode
			# Enter BinaryExpNode
	lw    $t0, 4($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Enter MinusNode
			# Enter ArithmeticNode
			# Enter BinaryExpNode
	lw    $t0, 4($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sub   $t0, $t0, $t1		# Subtract two expressions
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: recursion
	jal   _recursion
			# After Call function: recursion
	addu  $sp, $sp, 4
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	add   $t0, $t0, $t1		# Add two expressions
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $v0, 4($sp)	# POP
	addu  $sp, $sp, 4
	j     _recursion_Exit		# Return: jump to functioin epilogue
.L3:
_recursion_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
	.globl main
main:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 16
			# ASSIGN
	la    $t0, -8($fp)	# Load local var addr: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 5
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# ASSIGN
	la    $t0, -12($fp)	# Load local var addr: m
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push bool(true) on stack
	li    $t0, 1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# ASSIGN
	la    $t0, -16($fp)	# Load local var addr: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push bool(false) on stack
	li    $t0, 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# Begin Call function: f1
	jal   _f1
			# After Call function: f1
	addu  $sp, $sp, 0
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, -8($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: f2
	jal   _f2
			# After Call function: f2
	addu  $sp, $sp, 4
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# WRITE
	lw    $t0, -8($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.data
.L4:	.asciiz "\n"	# String Declaration
	.text
	la    $t0, .L4
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# ASSIGN
	la    $t0, -8($fp)	# Load local var addr: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 4
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 2
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: f3
	jal   _f3
			# After Call function: f3
	addu  $sp, $sp, 8
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# WRITE
	lw    $t0, -8($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L4
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# ASSIGN
	la    $t0, -8($fp)	# Load local var addr: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: f4
	jal   _f4
			# After Call function: f4
	addu  $sp, $sp, 0
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# WRITE
	lw    $t0, -8($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L4
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# ASSIGN
	la    $t0, -20($fp)	# Load local var addr: l
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -16($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -12($fp)	# Load local var: m
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: f5
	jal   _f5
			# After Call function: f5
	addu  $sp, $sp, 8
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# WRITE
	lw    $t0, -20($fp)	# Load local var: l
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L4
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# ASSIGN
	la    $t0, -8($fp)	# Load local var addr: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 5
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: recursion
	jal   _recursion
			# After Call function: recursion
	addu  $sp, $sp, 4
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# WRITE
	lw    $t0, -8($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L4
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
_main_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	li    $v0, 10
	syscall
