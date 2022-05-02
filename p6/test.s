	.data
	.align 2
_a:	.space 4	# Global Variable Declaratioin
	.data
	.align 2
_b:	.space 4	# Global Variable Declaratioin
	.text
	.globl main
main:		# Function Entry
	sw    $ra, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	sw    $fp, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	addu  $fp, $sp, 8
	subu  $sp, $sp, 12
			# ASSIGN
	la    $t0, -16($fp)	# Load local var addr: t3
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 3
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
	la    $t0, -12($fp)	# Load local var addr: t2
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
	la    $t0, -8($fp)	# Load local var addr: t1
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
			# Enter If Stmt
			# Enter EqualsNode
			# Enter EqualityExpNode
			# Enter BinaryExpNode
	lw    $t0, -16($fp)	# Load local var: t3
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 3
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
	bne   $t0, $t1, .L0		# Ifstmt: compare with true
			# PostIncrement
	la    $t0, -16($fp)	# Load local var addr: t3
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -16($fp)	# Load local var: t3
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	addi  $t1, $t1, 1
	sw    $t1, 0($t0)	# Increment by one
.L0:
			# WRITE
	lw    $t0, -16($fp)	# Load local var: t3
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.data
.L1:	.asciiz "\n"	# String Declaration
	.text
	la    $t0, .L1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# Enter If Stmt
			# Enter EqualsNode
			# Enter EqualityExpNode
			# Enter BinaryExpNode
	lw    $t0, -8($fp)	# Load local var: t1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 3
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
	bne   $t0, $t1, .L2		# Ifstmt: compare with true
			# PostIncrement
	la    $t0, -8($fp)	# Load local var addr: t1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -8($fp)	# Load local var: t1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	addi  $t1, $t1, 1
	sw    $t1, 0($t0)	# Increment by one
.L2:
			# WRITE
	lw    $t0, -8($fp)	# Load local var: t1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L1
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
	lw    $t0, -12($fp)	# Load local var: t2
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
	seq   $t0, $t0, $t1		# Set t0 to 1 if lhs == rhs, otherwise 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 1
	bne   $t0, $t1, .L3		# IfElseStmt: compare with true
			# WRITE
	.data
.L5:	.asciiz "t2 is true\n"	# String Declaration
	.text
	la    $t0, .L5
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
	b     .L4
.L3:
			# WRITE
	.data
.L6:	.asciiz "t2 is false\n"	# String Declaration
	.text
	la    $t0, .L6
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
.L4:
			# WRITE
	.data
.L7:	.asciiz "end of t2\n"	# String Declaration
	.text
	la    $t0, .L7
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
	lw    $t0, -16($fp)	# Load local var: t3
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
			# Push int on stack
	li    $t0, 4
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
	bne   $t0, $t1, .L8		# IfElseStmt: compare with true
			# WRITE
	.data
.L10:	.asciiz "t3 is 4\n"	# String Declaration
	.text
	la    $t0, .L10
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
	b     .L9
.L8:
			# WRITE
	.data
.L11:	.asciiz "t3 is not 4\n"	# String Declaration
	.text
	la    $t0, .L11
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
.L9:
			# WRITE
	.data
.L12:	.asciiz "end of t3\n"	# String Declaration
	.text
	la    $t0, .L12
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# ASSIGN
	la    $t0, -8($fp)	# Load local var addr: t1
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
.L13:
			# Enter LessNode
			# Enter RelationalExpNode
			# Enter BinaryExpNode
	lw    $t0, -8($fp)	# Load local var: t1
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
	slt   $t0, $t0, $t1		# Set t0 to 1 if lhs < rhs, otherwise 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 1
	bne   $t0, $t1, .L14		# While Stmt: compare with true
			# WRITE
	.data
.L15:	.asciiz "should not enter here\n"	# String Declaration
	.text
	la    $t0, .L15
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
	b     .L13
.L14:
			# WRITE
	.data
.L16:	.asciiz "end of t1 loop\n"	# String Declaration
	.text
	la    $t0, .L16
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, -8($fp)	# Load local var: t1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# Enter While Stmt
.L17:
			# Enter LessNode
			# Enter RelationalExpNode
			# Enter BinaryExpNode
	lw    $t0, -8($fp)	# Load local var: t1
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
	slt   $t0, $t0, $t1		# Set t0 to 1 if lhs < rhs, otherwise 0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $t1, 1
	bne   $t0, $t1, .L18		# While Stmt: compare with true
			# WRITE
	.data
.L19:	.asciiz "enter loop\n"	# String Declaration
	.text
	la    $t0, .L19
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# PostIncrement
	la    $t0, -8($fp)	# Load local var addr: t1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -8($fp)	# Load local var: t1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t1, 4($sp)	# POP
	addu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
	addi  $t1, $t1, 1
	sw    $t1, 0($t0)	# Increment by one
	b     .L17
.L18:
			# WRITE
	.text
	la    $t0, .L16
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, -8($fp)	# Load local var: t1
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L1
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
