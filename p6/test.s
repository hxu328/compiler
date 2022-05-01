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
	subu  $sp, $sp, 24
			# ASSIGN
	la    $t0, _a		# Load global var addr: a
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
			# ASSIGN
	la    $t0, _b		# Load global var addr: b
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
	la    $t0, -8($fp)	# Load local var addr: c
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
	sw    $t1, 0($t0)	# Store rhs to lhs
	sw    $t1, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, 4($sp)	# POP
	addu  $sp, $sp, 4
			# ASSIGN
	la    $t0, -12($fp)	# Load local var addr: d
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
	la    $t0, -16($fp)	# Load local var addr: e
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, _a		# Load global var: a
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
	la    $t0, -24($fp)	# Load local var addr: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, _b		# Load global var: b
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
	la    $t0, -20($fp)	# Load local var addr: f
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -8($fp)	# Load local var: c
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
	la    $t0, -28($fp)	# Load local var addr: w
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $t0, -12($fp)	# Load local var: d
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
			# WRITE
	lw    $t0, _a		# Load global var: a
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.data
.L0:	.asciiz "\n"	# String Declaration
	.text
	la    $t0, .L0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, _b		# Load global var: b
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, -8($fp)	# Load local var: c
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, -12($fp)	# Load local var: d
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, -16($fp)	# Load local var: e
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, -24($fp)	# Load local var: k
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, -20($fp)	# Load local var: f
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L0
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 4
	syscall
			# WRITE
	lw    $t0, -28($fp)	# Load local var: w
	sw    $t0, 0($sp)	# PUSH
	subu  $sp, $sp, 4
	lw    $a0, 4($sp)	# POP
	addu  $sp, $sp, 4
	li    $v0, 1
	syscall
			# WRITE
	.text
	la    $t0, .L0
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
