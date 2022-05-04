	.data
	.align 2
_memo:	.space 4	# Global Variable Declaratioin
	.text
_void_func_with_no_args:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 4
			# WRITE
	.data
.L0:	.asciiz "Called void_func_with_no_args\n"	# String Declaration
	.text
	la    $t0, .L0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
_void_func_with_no_args_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_void_func_with_args:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 0
			# WRITE
	.data
.L1:	.asciiz "Called void_func_with_args("	# String Declaration
	.text
	la    $t0, .L1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, 4($fp)	# Load local var: a
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.data
.L2:	.asciiz ")\n"	# String Declaration
	.text
	la    $t0, .L2
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
_void_func_with_args_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_sum:		# Function Entry
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
	j     _sum_Exit		# Return: jump to functioin epilogue
_sum_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_mult:		# Function Entry
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
			# Push int on stack
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
			# Enter While Stmt
.L3:
			# Enter GreaterNode
			# Enter RelationalExpNode
			# Enter BinaryExpNode
	lw    $t0, 4($fp)	# Load local var: a
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sgt   $t0, $t0, $t1		# Set t0 to 1 if lhs > rhs, otherwise 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 1
	bne   $t0, $t1, .L4		# While Stmt: compare with true
			# ASSIGN
	la    $t0, -8($fp)	# Load local var addr: c
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 8($fp)	# Load local var: b
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -8($fp)	# Load local var: c
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: sum
	jal   _sum
			# After Call function: sum
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
			# PostDecrement
	la    $t0, 4($fp)	# Load local var addr: a
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($fp)	# Load local var: a
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	addi  $t1, $t1, -1
	sw    $t1, 0($t0)	# Decrement by one
	b     .L3
.L4:
	lw    $t0, -8($fp)	# Load local var: c
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $v0, 4($sp)	# POP
	addu  $sp, $sp, 4
	j     _mult_Exit		# Return: jump to functioin epilogue
_mult_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_and:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 0
			# Enter AndNode
	lw    $t0, 4($fp)	# Load local var: m
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 1
	bne   $t0, $t1, .L5		# AndNode: evaluate lhs first
	lw    $t0, 8($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	b     .L6
.L5:
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
.L6:
	lw    $v0, 4($sp)	# POP
	addu  $sp, $sp, 4
	j     _and_Exit		# Return: jump to functioin epilogue
_and_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_or:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 0
			# Enter OrNode
	lw    $t0, 4($fp)	# Load local var: m
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 0
	bne   $t0, $t1, .L7		# OrNode: evaluate lhs first
	lw    $t0, 8($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	b     .L8
.L7:
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
.L8:
	lw    $v0, 4($sp)	# POP
	addu  $sp, $sp, 4
	j     _or_Exit		# Return: jump to functioin epilogue
_or_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_fib_recurison:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 0
			# Enter If Stmt
			# Enter LessEqNode
			# Enter RelationalExpNode
			# Enter BinaryExpNode
	lw    $t0, 4($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 2
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sle   $t0, $t0, $t1		# Set t0 to 1 if lhs <= rhs, otherwise 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 1
	bne   $t0, $t1, .L9		# Ifstmt: compare with true
			# Push int on stack
	li    $t0, 1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $v0, 4($sp)	# POP
	addu  $sp, $sp, 4
	j     _fib_recurison_Exit		# Return: jump to functioin epilogue
.L9:
			# Enter PlusNode
			# Enter ArithmeticNode
			# Enter BinaryExpNode
			# Enter MinusNode
			# Enter ArithmeticNode
			# Enter BinaryExpNode
	lw    $t0, 4($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 2
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sub   $t0, $t0, $t1		# Subtract two expressions
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: fib_recurison
	jal   _fib_recurison
			# After Call function: fib_recurison
	addu  $sp, $sp, 4
	sw    $v0, 0($sp)	# PUSH
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
			# Begin Call function: fib_recurison
	jal   _fib_recurison
			# After Call function: fib_recurison
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
	j     _fib_recurison_Exit		# Return: jump to functioin epilogue
_fib_recurison_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
_fib_dp:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 8
			# ASSIGN
	la    $t0, _memo		# Load global var addr: memo
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
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
			# ASSIGN
	la    $t0, -8($fp)	# Load local var addr: curr
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
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# Enter While Stmt
.L10:
			# Enter GreaterNode
			# Enter RelationalExpNode
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
	sgt   $t0, $t0, $t1		# Set t0 to 1 if lhs > rhs, otherwise 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 1
	bne   $t0, $t1, .L11		# While Stmt: compare with true
			# ASSIGN
	la    $t0, -12($fp)	# Load local var addr: tmp
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -8($fp)	# Load local var: curr
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
	la    $t0, -8($fp)	# Load local var addr: curr
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Enter PlusNode
			# Enter ArithmeticNode
			# Enter BinaryExpNode
	lw    $t0, _memo		# Load global var: memo
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -8($fp)	# Load local var: curr
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
			# ASSIGN
	la    $t0, _memo		# Load global var addr: memo
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -12($fp)	# Load local var: tmp
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
			# PostDecrement
	la    $t0, 4($fp)	# Load local var addr: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	addi  $t1, $t1, -1
	sw    $t1, 0($t0)	# Decrement by one
	b     .L10
.L11:
	lw    $t0, -8($fp)	# Load local var: curr
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $v0, 4($sp)	# POP
	addu  $sp, $sp, 4
	j     _fib_dp_Exit		# Return: jump to functioin epilogue
_fib_dp_Exit:		# Function Exit
	lw    $ra, 0($fp)	# Restore return address
	move  $t0, $fp		# Restore frame pointer
	lw    $fp, -4($fp)
	move  $sp, $t0		# Restore stack pointer
	jr    $ra
	.text
	.globl main
main:		# Function Entry
# __start:		# To get the Spim to recognize main function
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 20
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
	la    $t0, -12($fp)	# Load local var addr: j
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Enter UnaryMinusNode
			# Enter UnaryExpNode
			# Push int on stack
	li    $t0, 5
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, -1
	mult  $t0, $t1		# Negate exp
	mflo  $t0
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
	la    $t0, -16($fp)	# Load local var addr: m
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
	la    $t0, -20($fp)	# Load local var addr: n
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
			# ASSIGN
	la    $t0, -8($fp)	# Load local var addr: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Enter UnaryMinusNode
			# Enter UnaryExpNode
	lw    $t0, -12($fp)	# Load local var: j
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, -1
	mult  $t0, $t1		# Negate exp
	mflo  $t0
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
	la    $t0, -12($fp)	# Load local var addr: j
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Enter UnaryMinusNode
			# Enter UnaryExpNode
	lw    $t0, -8($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, -1
	mult  $t0, $t1		# Negate exp
	mflo  $t0
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
	la    $t0, -16($fp)	# Load local var addr: m
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Enter NotNode
			# Enter UnaryExpNode
	lw    $t0, -20($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 0
	beq   $t0, $t1, .L12		# Compare with false(0)
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	b     .L13
.L12:
	li    $t1, 1
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
.L13:
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
	la    $t0, -20($fp)	# Load local var addr: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Enter NotNode
			# Enter UnaryExpNode
	lw    $t0, -16($fp)	# Load local var: m
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 0
	beq   $t0, $t1, .L14		# Compare with false(0)
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	b     .L15
.L14:
	li    $t1, 1
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
.L15:
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# Begin Call function: void_func_with_no_args
	jal   _void_func_with_no_args
			# After Call function: void_func_with_no_args
	addu  $sp, $sp, 0
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, -8($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: void_func_with_args
	jal   _void_func_with_args
			# After Call function: void_func_with_args
	addu  $sp, $sp, 4
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# Enter PlusNode
			# Enter ArithmeticNode
			# Enter BinaryExpNode
	lw    $t0, -8($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -12($fp)	# Load local var: j
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	add   $t0, $t0, $t1		# Add two expressions
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: void_func_with_args
	jal   _void_func_with_args
			# After Call function: void_func_with_args
	addu  $sp, $sp, 4
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# Enter UnaryMinusNode
			# Enter UnaryExpNode
			# Push int on stack
	li    $t0, 1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, -1
	mult  $t0, $t1		# Negate exp
	mflo  $t0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: void_func_with_args
	jal   _void_func_with_args
			# After Call function: void_func_with_args
	addu  $sp, $sp, 4
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# WRITE
	.data
.L16:	.asciiz "sum(5, 5): "	# String Declaration
	.text
	la    $t0, .L16
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
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
.L17:	.asciiz " + "	# String Declaration
	.text
	la    $t0, .L17
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, -12($fp)	# Load local var: j
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.data
.L18:	.asciiz " = "	# String Declaration
	.text
	la    $t0, .L18
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, -12($fp)	# Load local var: j
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -8($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: sum
	jal   _sum
			# After Call function: sum
	addu  $sp, $sp, 8
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.data
.L19:	.asciiz "\n"	# String Declaration
	.text
	la    $t0, .L19
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	.data
.L20:	.asciiz "mult(5, -5): "	# String Declaration
	.text
	la    $t0, .L20
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, -12($fp)	# Load local var: j
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -8($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: mult
	jal   _mult
			# After Call function: mult
	addu  $sp, $sp, 8
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L18
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
			# Enter TimesNode
			# Enter ArithmeticNode
			# Enter BinaryExpNode
	lw    $t0, -8($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -12($fp)	# Load local var: j
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	mult  $t0, $t1		# Multiply two expressions
	mflo  $t0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L19
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# Enter IfElse Stmt
			# Enter EqualsNode
			# Enter EqualityExpNode
			# Enter BinaryExpNode
			# Enter NotNode
			# Enter UnaryExpNode
	lw    $t0, -20($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -16($fp)	# Load local var: m
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: and
	jal   _and
			# After Call function: and
	addu  $sp, $sp, 8
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 0
	beq   $t0, $t1, .L21		# Compare with false(0)
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	b     .L22
.L21:
	li    $t1, 1
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
.L22:
			# Enter NotNode
			# Enter UnaryExpNode
	lw    $t0, -20($fp)	# Load local var: n
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 0
	beq   $t0, $t1, .L23		# Compare with false(0)
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	b     .L24
.L23:
	li    $t1, 1
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
.L24:
			# Enter NotNode
			# Enter UnaryExpNode
	lw    $t0, -16($fp)	# Load local var: m
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 0
	beq   $t0, $t1, .L25		# Compare with false(0)
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	b     .L26
.L25:
	li    $t1, 1
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
.L26:
			# Begin Call function: or
	jal   _or
			# After Call function: or
	addu  $sp, $sp, 8
	sw    $v0, 0($sp)	# PUSH
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
	bne   $t0, $t1, .L27		# IfElseStmt: compare with true
			# WRITE
	.data
.L29:	.asciiz "de morgan's law passed!\n"	# String Declaration
	.text
	la    $t0, .L29
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
	b     .L28
.L27:
			# WRITE
	.data
.L30:	.asciiz "de morgan's law failed!\n"	# String Declaration
	.text
	la    $t0, .L30
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
.L28:
			# WRITE
	.data
.L31:	.asciiz "fib_recurison(10) = "	# String Declaration
	.text
	la    $t0, .L31
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
			# Push int on stack
	li    $t0, 10
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: fib_recurison
	jal   _fib_recurison
			# After Call function: fib_recurison
	addu  $sp, $sp, 4
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L19
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	.data
.L32:	.asciiz "fib_dp(10) = "	# String Declaration
	.text
	la    $t0, .L32
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
			# Push int on stack
	li    $t0, 10
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Begin Call function: fib_dp
	jal   _fib_dp
			# After Call function: fib_dp
	addu  $sp, $sp, 4
	sw    $v0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L19
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
